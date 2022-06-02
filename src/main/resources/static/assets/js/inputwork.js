let helmetData;
let workerData;
var list_save = new Array();
function work_Instruct()

{

    let userData;
    var helmet_id = document.getElementById("helmet_id").value;
    var helmetusing = document.getElementById("userNumber").value;
    var userNumber =document.getElementById("userNumber").value;
    var userHelmet = document.getElementById("helmet_id").value;
    
    var real_using;
    let po_int;
    let pointer;
     axios.get
                ("http://localhost:8080/api/helmet")
                    .then(function (response) {
                        helmetData=response.data;
                        console.log(response.data);
                       
                    })
                    .catch(function (error){

                        console.log(error);
                    });
    for(let i = 0; i < helmetData.length; i++)
    {
            if(helmetData[i].helmet_id.equals(helmet_id))
                {
                    if(helmetData[i].helmetusing.equals("no"))
                    {
                        po_int = 1;
                        pointer = i;
                        break;
                    }
                    else
                        {
                            po_int = -1;
                            real_using = helmetData[i].helmetusing;
                            break;
                        }
                }
            else {
                
            }
            
        }
    
    axios.get
                ("http://localhost:8080/api/user/findall")
                    .then(function (response) {
                        workerData=response.data;
                        console.log(response.data);
                    })
                    .catch(function (error){

                        console.log(error);
                    });
    
 for(let i =0; i <workerData.length; i++)
        {
            if(workerData[i].userNumber.equals(helmetusing))
                {
                    if(workerData[i].userHelmet.equals("no"))
                    {
                        po_int = 1;
                        pointer = i;
                        break;
                    }
                    else
                        {
                            po_int = -2;
                            real_using = workerData[i].userHelmet;
                            break;
                        }
                }
            else {
                
            }
            
        }

    if(po_int==1)
        {
  axios.post("http://localhost:8080/api/helmet",
              {
        helmet_id:helmet_id,
        helmetusing:helmetusing
    });
               axios.post("http://localhost:8080/api/user",
              {
        userNumber:userNumber,
        userHelmet:userHelmet
        
        
    });
            alert(helmet_id+" 헬멧에 " + helmetusing + " 노동자 등록 완료.");
        }
    else if(po_int==-1)
        {
            alert("작업지시 실패!! " +"\n (" + helmet_id +" 헬멧이 사용중입니다. \n Error: "+"real_using )");
        }
    else if(po_int==-2)
        {
            alert("작업지시 실패!! " +"\n ( 노동자 " + userNumber +" 가 작업중 입니다. \n Error: "+"real_using )");
        }
}


function work_Delete() {
	
    var sel_list = document.getElementById('works');
	var index = obj.selectedIndex;
	var value = obj.options[index].value;
	var text = obj.options[index].text;
	console.log( 'index=', index, 'value=', value, 'text=', text );
    
    
    for(let i =0; i< list_save.length; i++)
        {
        let del_id = list_save[i];
    //여기가 삭제하는 부분 ~~~~~~~~~~~~~~~~~
     axios.post("http://localhost:8080/api/helmet/삭제삭제",
              {
        del_id:delid
    });
        }
   //~~~~~~~~~~~~~~~~~~~

}

function work_load()
{
    let workerDData;
    let usingHelmetID = new Array();
    let usingworkerData = new Array();
      axios.get
                ("http://localhost:8080/api/worker")
                    .then(function (response) {
                        workerDData = response.data;
                        console.log(response.data);
                    })
                    .catch(function (error){

                        console.log(error);
                    });
    
    for(let i =0; i < 1; i++)
        {
            workerDData.push(workerDData[i].helmetId);
            usingworkerData.push(workerDData[i].userId);
        }
    var select_work = document.getElementById('works');
    for(let i = 0; i < usingHelmetID.length; i++)
        {
            let select_list = 
                `<option value='${usingHelmetID[i]}'>
        ${usingHelmetID[i]+" & "+usingworkerData[i]}</option>`

            list_save[i]=usingHelmetID[i];
            select_work.innerHTML += select_list;
        }

}







