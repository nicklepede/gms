package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cvkk;
import defpackage.cvkl;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class TeleportingSyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvkk();
    public final SyncRequest a;

    public TeleportingSyncRequest(SyncRequest syncRequest) {
        this.a = syncRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                int a = atzr.a(obtain);
                atzr.t(obtain, 1, this.a, i, false);
                atzr.c(obtain, a);
                byte[] marshall = obtain.marshall();
                File createTempFile = File.createTempFile("teleporter", ".tmp", null);
                RandomAccessFile randomAccessFile = new RandomAccessFile(createTempFile, "rw");
                randomAccessFile.write(marshall);
                randomAccessFile.seek(0L);
                createTempFile.delete();
                parcel.writeFileDescriptor(randomAccessFile.getFD());
                randomAccessFile.close();
            } catch (IOException e) {
                throw new cvkl("Couldn't write SafeParcelable to unlinked file.", e);
            }
        } finally {
            obtain.recycle();
        }
    }
}
