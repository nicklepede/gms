package com.google.android.gms.accountsettings.content;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.provider.SearchIndexablesContract;
import android.text.TextUtils;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.R;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.tkb;
import defpackage.tkc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SettingsSearchChimeraContentProvider extends ContentProvider {
    private UriMatcher a;
    private tkb b;

    private final tkb a() {
        if (this.b == null) {
            this.b = new tkb(getContext());
        }
        return this.b;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        String str = providerInfo.authority;
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.a = uriMatcher;
        uriMatcher.addURI(str, "settings/indexables_raw", 2);
        this.a.addURI(str, "settings/non_indexables_key", 3);
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Delete not supported");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        int match = this.a.match(uri);
        if (match == 2) {
            return "vnd.android.cursor.dir/indexables_raw";
        }
        if (match != 3) {
            return null;
        }
        return "vnd.android.cursor.dir/non_indexables_key";
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not supported");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.a.match(uri);
        if (match != 2) {
            if (match != 3) {
                return null;
            }
            MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
            a();
            int i = elgo.d;
            elgo elgoVar = elpg.a;
            int i2 = ((elpg) elgoVar).c;
            for (int i3 = 0; i3 < i2; i3++) {
                String str3 = (String) elgoVar.get(i3);
                Object[] objArr = new Object[SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS.length];
                objArr[0] = str3;
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        }
        MatrixCursor matrixCursor2 = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
        tkb a = a();
        elgo B = elgo.B(a.a("personal_info", 10003, R.string.as_settings_search_personal_info), a.c("data_and_personalization", 10004, R.string.as_settings_search_data_and_privacy, 0, R.string.as_settings_search_data_and_personalization), a.a("security", 10006, R.string.as_settings_search_security), a.a("payments", 10007, R.string.as_settings_search_payments_and_subscriptions), a.b("security_checkup", 400, R.string.as_settings_search_security_checkup, R.string.as_settings_search_security), a.b("photo", 10003, R.string.as_settings_search_photo, R.string.as_settings_search_personal_info), a.c("my_activity", 219, R.string.as_settings_search_google_activity, R.string.as_settings_search_data_and_privacy, R.string.as_settings_search_my_activity), a.b("password", 401, R.string.as_settings_search_password, R.string.as_settings_search_security), a.c("two_step_verification", 403, R.string.as_settings_search_two_step_verification, R.string.as_settings_search_security, R.string.as_settings_search_two_keyword), a.b("email", 203, R.string.as_settings_search_email, R.string.as_settings_search_personal_info), a.b("privacy_checkup", 200, R.string.as_settings_search_privacy_checkup, R.string.as_settings_search_data_and_privacy), a.b("activity_controls", 212, R.string.as_settings_search_activity_controls, R.string.as_settings_search_data_and_privacy), a.b("your_devices", 410, R.string.as_settings_search_your_devices, R.string.as_settings_search_security), a.b("delete_account", 303, R.string.as_settings_search_delete_your_google_account, R.string.as_settings_search_data_and_privacy), a.b("phone", 204, R.string.as_settings_search_phone_number, R.string.as_settings_search_personal_info));
        int i4 = ((elpg) B).c;
        for (int i5 = 0; i5 < i4; i5++) {
            tkc tkcVar = (tkc) B.get(i5);
            Object[] objArr2 = new Object[SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.length];
            objArr2[1] = tkcVar.a;
            objArr2[2] = null;
            elgo elgoVar2 = tkcVar.b;
            objArr2[5] = (elgoVar2 == null || elgoVar2.isEmpty()) ? null : TextUtils.join(", ", elgoVar2);
            objArr2[6] = tkcVar.c;
            objArr2[12] = tkcVar.d;
            objArr2[9] = tkcVar.e;
            objArr2[10] = tkcVar.f;
            objArr2[11] = tkcVar.g;
            objArr2[8] = null;
            matrixCursor2.addRow(objArr2);
        }
        return matrixCursor2;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update not supported");
    }
}
