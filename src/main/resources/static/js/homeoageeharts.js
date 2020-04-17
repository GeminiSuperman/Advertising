layui.use('element', function() {
	var element = layui.element; //加載element模块
	var $ = layui.jquery;
	var layer = layui.layer; //加载layer模块
	var upload = layui.upload; //加载upload模块
	// 基于准备好的dom，初始化echarts实例
	var myChart = echarts.init(document.getElementById('echarts'));
	myChart.setOption({
		series: [{
			name: '访问来源',
			type: 'pie', // 设置图表类型为饼图
			radius: '60%', // 饼图的半径，外半径为可视区尺寸（容器高宽中较小一项）的 55% 长度。
			right: '50%',
			data: [ // 数据数组，name 为数据项名称，value 为数据项值
				{ value: 735, name: 'APP' },
				{ value: 574, name: 'H5' },
				{ value: 210, name: 'PC端' },
				{ value: 600, name: '小程序' },
			]
		}, {
			name: 'tow',
			type: 'pie',
			radius: '60%',
			left: '45%',
			top: '1%',
			data: [
				{ value: 900, name: '地产' },
				{ value: 768, name: '新闻' },
				{ value: 234, name: '教育' },
				{ value: 900, name: '投资' },
				{ value: 685, name: '医疗' },
				{ value: 333, name: '商城' },
				{ value: 375, name: '工程' },
			]
		}]

	})
});