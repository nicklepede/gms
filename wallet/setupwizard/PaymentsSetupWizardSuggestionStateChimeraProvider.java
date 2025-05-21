package com.google.android.gms.wallet.setupwizard;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.chimera.ContentProvider;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PaymentsSetupWizardSuggestionStateChimeraProvider extends ContentProvider {
    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Delete operation not supported currently.");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("GetType operation is not supported currently.");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert operation is not supported currently.");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("Query operation is not supported currently.");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update operation is not supported currently.");
    }
}
