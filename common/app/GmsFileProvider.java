package com.google.android.gms.common.app;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.inf;
import java.io.FileNotFoundException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsFileProvider extends inf {
    static final String[] a = new String[0];
    private boolean b = false;

    @Override // defpackage.inf, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        try {
            super.attachInfo(context, providerInfo);
        } catch (IllegalArgumentException | NullPointerException unused) {
            this.b = true;
        }
    }

    @Override // defpackage.inf, android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (this.b) {
            return 0;
        }
        return super.delete(uri, str, strArr);
    }

    @Override // defpackage.inf, android.content.ContentProvider
    public final String getType(Uri uri) {
        if (this.b) {
            return null;
        }
        return super.getType(uri);
    }

    @Override // defpackage.inf, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (this.b) {
            throw new FileNotFoundException("FileProvider creation failed.");
        }
        return super.openFile(uri, str);
    }

    @Override // defpackage.inf, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.b ? new MatrixCursor(a) : super.query(uri, strArr, str, strArr2, str2);
    }
}
