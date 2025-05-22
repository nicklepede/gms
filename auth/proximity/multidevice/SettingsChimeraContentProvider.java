package com.google.android.gms.auth.proximity.multidevice;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.R;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import defpackage.aemn;
import defpackage.aend;
import defpackage.atzb;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SettingsChimeraContentProvider extends ContentProvider {
    public static String a(Context context, String str) {
        atzb.j();
        SyncedCryptauthDevice b = aend.b(context, str);
        return b == null ? Build.MODEL : b.c;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        List<String> pathSegments;
        Uri parse = Uri.parse(str2);
        if (parse == null || !"content".equals(parse.getScheme()) || !"com.google.android.gms.auth.proximity.multidevice.settings.provider".equals(parse.getAuthority()) || parse.getPort() != -1 || (pathSegments = parse.getPathSegments()) == null || pathSegments.size() != 2 || !str.equals(pathSegments.get(0))) {
            return null;
        }
        String str3 = pathSegments.get(1);
        if ("getText".equals(str)) {
            Bundle bundle2 = new Bundle();
            if ("summary".equals(str3)) {
                bundle2.putString("com.android.settings.summary", aemn.a(getContext()) ? getContext().getString(R.string.settings_summary_enabled) : getContext().getString(R.string.settings_summary_disabled, getContext().getString(R.string.common_phone_lowercase)));
            }
            if (!bundle2.isEmpty()) {
                return bundle2;
            }
        }
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
