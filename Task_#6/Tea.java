import net.sourceforge.jFuzzyLogic.FIS;


/*

 * Тестовый парсер FCL-файла
 * компилируем командой "javac -cp ./jFuzzyLogic_v2.1a.jar Tea.java"
 * далее кладем файл Tea.class в каталог Tea
 * и запускаем командой "java -cp ./jFuzzyLogic_v2.1a.jar:Tea Tea" (Unix)

 */



/*

	влажность воздуха
	температура окр среды
	атмосферное давление
	насыщенность почвы минералами
	
	количество воды
	количетсво минерального удобренря

*/


public class Tea {
	
	public static void main(String[] args) throws Exception {
		
		FIS fuzzyInferenceSystem = FIS.load("Tea.fcl", true);
		
		if (fuzzyInferenceSystem == null) { 
			System.err.println("Error loading file with name 'Tea.fcl'");
			return;
		}

		// Показываем.
		fuzzyInferenceSystem.chart();

		// Задаем значения входных переменных.
		fuzzyInferenceSystem.setVariable("requiredFluidTemperature", 80);
		fuzzyInferenceSystem.setVariable("boilingTime", 4);
		fuzzyInferenceSystem.setVariable("cupVolume", 200);
		fuzzyInferenceSystem.setVariable("fluidVolume", 180);

		// Вычисляем.
		fuzzyInferenceSystem.evaluate();

		// Печатаем информацию о выходной перменной.
		System.out.println(fuzzyInferenceSystem.getVariable("isFull").toString());
		System.out.println(fuzzyInferenceSystem.getVariable("fluidTemperature").toString());

		// Печатаем вещественное значение последней дефаззификации выходной переменной.
		System.out.println(fuzzyInferenceSystem.getVariable("isFull").getValue());
		System.out.println(fuzzyInferenceSystem.getVariable("fluidTemperature").getValue());

		// Показываем график выходной переменной. 
		fuzzyInferenceSystem.getVariable("isFull").chartDefuzzifier(true);
		fuzzyInferenceSystem.getVariable("fluidTemperature").chartDefuzzifier(true);

		// Печатаем набор правил.
		System.out.println(fuzzyInferenceSystem);
		
	}
	
}