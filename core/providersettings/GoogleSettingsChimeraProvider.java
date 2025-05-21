package com.google.android.gms.core.providersettings;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.chimera.ContentProvider;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.ips;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GoogleSettingsChimeraProvider extends ContentProvider {
    private static final asot a = asot.b("GoogleSettingsProvider", asej.CORE);

    private static final void a() {
        int i = ips.a;
        ((ejhf) ((ejhf) a.j()).ah((char) 3305)).x("Provider is only supported on API 35+");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        a();
        return 0;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        a();
        return 0;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        a();
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        a();
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        int i = ips.a;
        ((ejhf) ((ejhf) a.j()).ah((char) 3308)).x("Provider is only supported on API 35+");
        return false;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a();
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        a();
        return 0;
    }
}
