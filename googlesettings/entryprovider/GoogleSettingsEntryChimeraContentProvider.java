package com.google.android.gms.googlesettings.entryprovider;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;
import defpackage.auid;
import defpackage.ausn;
import defpackage.blwk;
import defpackage.dwtn;
import defpackage.eluo;
import defpackage.fxxm;
import defpackage.iri;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GoogleSettingsEntryChimeraContentProvider extends ContentProvider {
    private static final ausn a = ausn.b("GoogleSettingsEntryContentProvider", auid.GOOGLESETTINGS);

    public GoogleSettingsEntryChimeraContentProvider() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        fxxm.f(str, "method");
        int i = iri.a;
        ((eluo) a.h()).x("Platform version is not at least V");
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        fxxm.f(uri, "uri");
        throw new UnsupportedOperationException("Only call() on sdk version 35 (Android V) is supported");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        fxxm.f(uri, "uri");
        throw new UnsupportedOperationException("Only call() on sdk version 35 (Android V) is supported");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        fxxm.f(uri, "uri");
        throw new UnsupportedOperationException("Only call() on sdk version 35 (Android V) is supported");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        fxxm.f(uri, "uri");
        throw new UnsupportedOperationException("Only call() on sdk version 35 (Android V) is supported");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        fxxm.f(uri, "uri");
        throw new UnsupportedOperationException("Only call() on sdk version 35 (Android V) is supported");
    }

    public GoogleSettingsEntryChimeraContentProvider(dwtn dwtnVar, blwk blwkVar) {
    }

    public /* synthetic */ GoogleSettingsEntryChimeraContentProvider(dwtn dwtnVar, blwk blwkVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(1 == (i & 1) ? null : dwtnVar, (i & 2) != 0 ? null : blwkVar);
    }
}
