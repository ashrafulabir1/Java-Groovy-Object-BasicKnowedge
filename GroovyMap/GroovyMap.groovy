package GroovyMap

class GroovyMap {
	public static void main(String[] args) {
def Map = [
        names: [ 'Abir', 'Anika', 'Anita' ], //key: values
        subjectByStudent : [
            Abir: [ 'Math', 'Physics', 'Chemistry'],  //key: value
            Anika: [ 'English', 'Bangla' ,'Accounting' ],  ////key: value
            Anita: ['Math', 'Arts', 'Philosophy']  ////key: value
        ]
    ]

for (i in Map.names) {
    print "The student Name is: $i \n"

    for (j in Map.subjectByStudent."$i") {  
        print "Favorite subject is: $j \n"
    }
    
    print "========\n\n"
    }
  }
}
