package com.google.android.gms.libs.binder.bigtransaction;

import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SafeCloseableParcelFileDescriptor extends ParcelFileDescriptor {
    public SafeCloseableParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor);
    }

    @Override // android.os.ParcelFileDescriptor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException unused) {
        }
    }
}
