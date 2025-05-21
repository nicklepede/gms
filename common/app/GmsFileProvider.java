package com.google.android.gms.common.app;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.ilp;
import java.io.FileNotFoundException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsFileProvider extends ilp {
    static final String[] a = new String[0];
    private boolean b = false;

    @Override // defpackage.ilp, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        try {
            super.attachInfo(context, providerInfo);
        } catch (IllegalArgumentException | NullPointerException unused) {
            this.b = true;
        }
    }

    @Override // defpackage.ilp, android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (this.b) {
            return 0;
        }
        return super.delete(uri, str, strArr);
    }

    @Override // defpackage.ilp, android.content.ContentProvider
    public final String getType(Uri uri) {
        if (this.b) {
            return null;
        }
        return super.getType(uri);
    }

    @Override // defpackage.ilp, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (this.b) {
            throw new FileNotFoundException("FileProvider creation failed.");
        }
        return super.openFile(uri, str);
    }

    @Override // defpackage.ilp, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.b ? new MatrixCursor(a) : super.query(uri, strArr, str, strArr2, str2);
    }
}
