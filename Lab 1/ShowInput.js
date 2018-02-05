function showInput() {
    document.getElementById('displayEducation').innerHTML = document.getElementById("Level_Education").value;
    document.getElementById('displaySemester').innerHTML = document.getElementById("Semester").value;
    document.getElementById('displayCareer').innerHTML = document.getElementById("Career_Option").value;
    location.href="CourseInfo.html";
    document.onload('display').innerHTML=document.getElementById("Level_Education").value;
    document.onload('display2').innerHTML=document.getElementById("Semester").value;
    document.onload('display3').innerHTML=document.getElementById("Career_Option").value;
}

//function NavigatetoCourseInfo()
  //  {
    //    location.href="CourseInfo.html";
    //}
