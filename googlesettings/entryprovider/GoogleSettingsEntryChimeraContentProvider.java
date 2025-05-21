package com.google.android.gms.googlesettings.entryprovider;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;
import defpackage.asej;
import defpackage.asot;
import defpackage.bjpu;
import defpackage.dujb;
import defpackage.ejhf;
import defpackage.fvbo;
import defpackage.ips;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GoogleSettingsEntryChimeraContentProvider extends ContentProvider {
    private static final asot a = asot.b("GoogleSettingsEntryContentProvider", asej.GOOGLESETTINGS);

    public GoogleSettingsEntryChimeraContentProvider() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        fvbo.f(str, "method");
        int i = ips.a;
        ((ejhf) a.h()).x("Platform version is not at least V");
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        fvbo.f(uri, "uri");
        throw new UnsupportedOperationException("Only call() on sdk version 35 (Android V) is supported");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        fvbo.f(uri, "uri");
        throw new UnsupportedOperationException("Only call() on sdk version 35 (Android V) is supported");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        fvbo.f(uri, "uri");
        throw new UnsupportedOperationException("Only call() on sdk version 35 (Android V) is supported");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        fvbo.f(uri, "uri");
        throw new UnsupportedOperationException("Only call() on sdk version 35 (Android V) is supported");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        fvbo.f(uri, "uri");
        throw new UnsupportedOperationException("Only call() on sdk version 35 (Android V) is supported");
    }

    public GoogleSettingsEntryChimeraContentProvider(dujb dujbVar, bjpu bjpuVar) {
    }

    public /* synthetic */ GoogleSettingsEntryChimeraContentProvider(dujb dujbVar, bjpu bjpuVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(1 == (i & 1) ? null : dujbVar, (i & 2) != 0 ? null : bjpuVar);
    }
}
