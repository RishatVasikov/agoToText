package ru.netology


fun main() {
    println("������� ���������� ����� ����� \n 1.Alex \n 2.Vasya \n 3.Jenya \n 4.Oleg \n 5.Arkadiy \n 6.Crazy Frog")
    var seconds: Int = 0
    when (readLine()!!.toInt()) {
        1 -> seconds = 56
        2 -> seconds = 3441
        3 -> seconds = 3720
        4 -> seconds = 90501
        5 -> seconds = 129602
        6 -> seconds = 269842
    }
    val minutes = seconds / 60
    val hours = seconds / 60 / 60
    var timeAgoMin: String = "�����"
    when (minutes % 60) {
        1 -> timeAgoMin = "������"
        2, 3, 4 -> timeAgoMin = "������"
    }
    val remainigMinutes = seconds / 60 % 60
    when (remainigMinutes % 60) {
        1 -> timeAgoMin = "������"
        2, 3, 4 -> timeAgoMin = "������"
    }
    var timeAgoHours = "�����"
    when (hours % 3600) {
        1 -> timeAgoHours = "���"
        2, 3, 4 -> timeAgoHours = "����"
    }
    if (0 <= seconds && seconds <= 60) {
        println("���� ��� ������ �������")
    } else if (61 <= seconds && seconds <= 3600) {
              println("���� ��� ������ $minutes $timeAgoMin �����")
    } else if (3601 <= seconds && seconds <= 86400) {
                println("���� ��� ������ $hours $timeAgoHours $remainigMinutes $timeAgoMin �����")
    } else if (86401 <= seconds && seconds <= 129600) {
        println("���� ��� ������ �������")
    } else if (129600 <= seconds && seconds <= 172800){
        println("���� ��� ������ �����")
    } else if (172800 <= seconds) {
            println("���� ��� ������ �����")
        }
}
