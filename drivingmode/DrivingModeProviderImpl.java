package com.google.android.gms.drivingmode;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.R;
import defpackage.azug;
import defpackage.azul;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class DrivingModeProviderImpl extends ContentProvider {
    Context a;

    @Override // com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        if (!"DrivingModePreferenceSummary".equals(str)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        azug.b();
        if (new azul(this.a).x()) {
            bundle2.putString("com.android.settings.summary", this.a.getString(R.string.common_on));
            return bundle2;
        }
        bundle2.putString("com.android.settings.summary", this.a.getString(R.string.common_off));
        return bundle2;
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
        this.a = getContext();
        return true;
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
