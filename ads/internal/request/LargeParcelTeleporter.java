package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.arxc;
import defpackage.aspm;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class LargeParcelTeleporter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new o();
    public ParcelFileDescriptor a;
    public Parcelable b;
    public boolean c;

    public LargeParcelTeleporter(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
        this.b = null;
        this.c = true;
    }

    public final ParcelFileDescriptor a() {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.b.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        com.google.android.gms.ads.internal.util.future.e.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.request.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = marshall;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            aspm.b(dataOutputStream2);
                                        } catch (IOException e) {
                                            e = e;
                                            dataOutputStream = dataOutputStream2;
                                            int i = com.google.android.gms.ads.internal.util.c.a;
                                            com.google.android.gms.ads.internal.util.client.h.h("Error transporting the ad response", e);
                                            com.google.android.gms.ads.internal.c.d().d(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                aspm.b(outputStream);
                                            } else {
                                                aspm.b(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                aspm.b(outputStream);
                                            } else {
                                                aspm.b(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        });
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e) {
                        e = e;
                        int i = com.google.android.gms.ads.internal.util.c.a;
                        com.google.android.gms.ads.internal.util.client.h.h("Error transporting the ad response", e);
                        com.google.android.gms.ads.internal.c.d().d(e, "LargeParcelTeleporter.pipeData.2");
                        aspm.b(autoCloseOutputStream);
                        this.a = parcelFileDescriptor;
                        return this.a;
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                }
                this.a = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a();
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.c(parcel, a);
    }

    public LargeParcelTeleporter(SafeParcelable safeParcelable) {
        this.a = null;
        this.b = safeParcelable;
        this.c = false;
    }
}
