## drawerを導入した

```xml
    <style name="Theme.Androidplayground.NoActionBar">
        <item name="windowActionBar">false</item>
        <item name="windowNoTitle">true</item>
    </style>
```
をthemeに書いて、androidmanifestでアクティビティのテーマにする

drawer_menuのitemのidとnavigationのidを同じにするとナビゲーションする

## メモ

onCreateOptionsMenuをオーバーライドすることで「・・・」のメニューが現れる