// pages/components/comment.js
Component({
  /**
   * 组件的属性列表
   */
  properties: {

  },

  /**
   * 组件的初始数据
   */
  data: {
  parentComments:[
    "1","2","3"
  ],
  childComments:[
    "1","2","3"
  ],
    hasMoreComments:true,
    isMoreCommentsShowed:false,
    moreButtonContent:"查看3条更多回复"
  },

  /**
   * 组件的方法列表
   */
  methods: {
  showMoreContents:function(e)
  {
   this.setData({
     isMoreCommentsShowed:!this.data.isMoreCommentsShowed
   })
   if(this.data.isMoreCommentsShowed==true)
   {
     this.setData({
       moreButtonContent:"收起更多回复"
     })
   }
   else
   {
     this.setData({
       isMoreCommentsShowed:"查看更多回复"
     })
   }
  }
  }
})