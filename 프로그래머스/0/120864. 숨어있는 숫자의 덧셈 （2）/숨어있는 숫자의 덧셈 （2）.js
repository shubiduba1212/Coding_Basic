function solution(my_string) {
    var answer = 0;
    const arr = my_string.split('').map(char => {if(isNaN(parseInt(char))){return char = '_';}else{return char;}}).join('').split('_').filter(item => item != '');
    for(i of arr) {
        answer += parseInt(i);
    }
    // for(let i in my_string){
    //     if(!isNaN(parseInt(my_string[i]))){
    //         let num = my_string[i];
    //         for(let j = i+1; j < my_string.length; j++){
    //             if(!isNaN(parseInt(my_string[j]))){
    //                 num += my_string[j];
    //             }else{
    //                 break;
    //             }
    //         }
    //         answer += parseInt(num);
    //     }
    // }
    return answer;
}