package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctbg;
import defpackage.ctbh;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class TeleportingSyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctbg();
    public final SyncRequest a;

    public TeleportingSyncRequest(SyncRequest syncRequest) {
        this.a = syncRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                int a = arxc.a(obtain);
                arxc.t(obtain, 1, this.a, i, false);
                arxc.c(obtain, a);
                byte[] marshall = obtain.marshall();
                File createTempFile = File.createTempFile("teleporter", ".tmp", null);
                RandomAccessFile randomAccessFile = new RandomAccessFile(createTempFile, "rw");
                randomAccessFile.write(marshall);
                randomAccessFile.seek(0L);
                createTempFile.delete();
                parcel.writeFileDescriptor(randomAccessFile.getFD());
                randomAccessFile.close();
            } catch (IOException e) {
                throw new ctbh("Couldn't write SafeParcelable to unlinked file.", e);
            }
        } finally {
            obtain.recycle();
        }
    }
}
