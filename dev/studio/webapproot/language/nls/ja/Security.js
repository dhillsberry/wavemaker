/*
 *  Copyright (C) 2011 VMWare, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
{
saveButton: {hint: "セキュリティ設定を保存"},
label1a: {caption: "セキュリティ設定"},
secProviderInput: {caption: "セキュリティプロバイダー"},
secEnableInput: {caption: "セキュリティを有効"},
showLoginPageInput: {caption: "ログインページを表示"},
emptyLayer: {caption: "空"},
demoLayer: {caption: "デモ"},
demoUsernameInput: {caption: "ユーザー名"},
demoPasswordInput: {caption: "パスワード"},
demoRoleInput: {caption: "ロール"},
demoAddUserButton: {hint: "ユーザーを追加"},
demoDeleteUserButton: {hint: "ユーザーを削除"},
databaseLayer: {caption: "データベース"},
dbDataModelInput: {caption: "データモデル"},
dbEntityInput: {caption: "エンティティ"},
dbUsernameInput: {caption: "ユーザー名フィールド <span style='cursor:pointer;font-weight:bold;color: black;' id='HelpUID1'>?</a>"},
dbUseridInput: {caption: "ユーザーIDフィールド <span style='cursor:pointer;font-weight:bold;color: black;' id='HelpUID2'>?</a>"},
dbPasswordInput: {caption: "パスワードフィールド"},
dbRoleInput: {caption: "ロールフィールド（エンタープライズユーザーのみ）"},
labelmt: {caption: "マルチテナント設定（エンタープライズユーザーのみ）"},
tenantIdField: {caption: "テナントIDフィールド名"},
defTenantId: {caption: "デフォルトテナントID"},
dbRoleBySQLCheckbox: {caption: "SQLクエリーによるロール"},
dbTestSQLInput: {caption: "ユーザーID"},
dbTestSQLButton: {caption: "クエリーテスト"},
ldapLayer: {caption: "LDAP"},
ldapUrlInput: {caption: "LDAP URL"},
ldapManagerDnInput: {caption: "管理者DN"},
ldapManagerPasswordInput: {caption: "管理者パスワード"},
ldapUserDnPatternInput: {caption: "ユーザーDNパターン"},
ldapSearchRoleCheckbox: {caption: "ユーザーロールを検索"},
ldapGroupSearchBaseInput: {caption: "グループ検索ベース"},
ldapGroupRoleAttributeInput: {caption: "グループロール属性"},
ldapGroupSearchFilterInput: {caption: "グループ検索フィルター"},
ldapConnectionButton: {caption: "接続テスト"},
jossoLayer: {caption: "JOSSO"},
label2a: {caption: "ロール設定（エンタープライズユーザーのみ）"},
addRoleInput: {caption: "ロール"},
addRoleButton: {hint: "ロールを追加"},
deleteRoleButton: {hint: "ロールを削除"},
label1: {caption: "ライブレイアウトログイン"},
liveLayoutUser: {caption: "ユーザー"},
liveLayoutPassword: {caption: "パスワード"},
label2: {caption: "このユーザーとパスワードはライブレイアウトへのログインで使用されるアカウントです。データベースやJavaサービスにアクセスするために使用されます。"},

MENU_SELECT_ONE: "- 選択してください -",
MENU_NO_VALUE: "(なし)",
HELP_DIALOG_HEADER_USERNAME: "ユーザー名フィールド",
HELP_DIALOG_CONTENT_USERNAME: "ログインのためのユーザー名を選択してください。通常はメールアドレスまたはユーザーの個人名に基づいたIDです。次のようにすることでログインユーザーのユーザー名をアプリケーション内から検索することもできます。<ol><li>新しいServiceVariableを作成</li><li>'service'に'securityService'を設定</li><li>オペレーション'getUserName'を選択</li></ol>",
HELP_DIALOG_HEADER_USERID: "ユーザーIDフィールド",
HELP_DIALOG_CONTENT_USERID: "データベース内でユーザーを特定できるユニークなユーザーIDを選択してください。通常はデータベースがユーザーのエントリーに割り当てた番号を使います。メールアドレスを使用することもできますが、他のデータベースのテーブルで関連するユーザーアカウントを特定するために使われた場合にデータベースサイズが大きくなる傾向があります。プロジェクトの実行中なら次の手順でIDを検索することができます。<ol><li>新しいServiceVariableを作成</li><li>'service'に'securityService'を設定</li><li>オペレーション'getUserId'を選択</li></ol>",
ERROR_DEMO_NO_USER: "少なくても一人のユーザーをリストに追加しなければなりません！",
ERROR_DATABASE_INPUT_REQUIRED: "すべての必須フィールドに入力しなければなりません！",
ERROR_LDAP_INPUT_REQUIRED: "すべての必須フィールドに入力しなければなりません！",
ALERT_USERNAME_EXISTS: "ユーザー名がすでに存在しています。名前を変更してください！",
ALERT_USER_INPUT_REQUIRED: "ユーザー名とパスワードを入力してください！",
WAIT_TEST_SQL: "クエリーを実行しています...",
WAIT_TEST_LDAP: "LDAP接続のテスト中です...",
TEST_LDAP_MESSAGE_SUCCESS: "接続に成功しました。",
ALERT_ROLE_EXISTS: "ロールがすでに存在しています。別のロールを選択してください！",
ALERT_JOSSO_ONLY_ONE_ROLE: "JOSSOではロールはひとつしか指定できません。新しいものを入力する前に既存のものを削除してください。",

ALERT_ROLE_EMPTY: "ロールを入力してください！",
DEMO_USER_USERNAME: "ユーザー名",
DEMO_USER_PASSWORD: "パスワード",
DEMO_USER_ROLE: "ロール"
}