public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();           // このフィールドに文書を構築していく
    protected void buildTitle(String title) {                       // プレーンテキストでのタイトル
        buffer.append("==============================\n");          // 飾り線
        buffer.append("『" + title + "』\n");                       // 『』つきのタイトル
        buffer.append("\n");                                        // 空行
    }
    protected void buildString(String str) {                        // プレーンテキストでの文字列
        buffer.append('■' + str + "\n");                           // ■つきの文字列
        buffer.append("\n");                                        // 空行
    }
    protected void buildItems(String[] items) {                     // プレーンテキストでの箇条書き
        for (int i = 0; i < items.length; i++) {
            buffer.append("　・" + items[i] + "\n");                // ・つきの項目
        }
        buffer.append("\n");                                        // 空行
    }
    protected void buildDone() {                                 // 文書の完成
        buffer.append("==============================\n");          // 飾り線
    }
    public String getResult() {
        return buffer.toString();                                   // StringBufferをStringに変換
    }
}
