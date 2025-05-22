package com.google.android.gms.wearable.node.accountmatching.matcher;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dnnu;
import defpackage.dofi;
import defpackage.elgo;
import defpackage.elhx;
import defpackage.elhz;
import defpackage.elpg;
import defpackage.elsn;
import defpackage.fgot;
import defpackage.fgpx;
import defpackage.fgpy;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fgtq;
import defpackage.fguf;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class AccountsMatcher$AccountsMatcherResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dnnu();
    public final elhz a;
    public final elhz b;
    private final elhz c;

    public AccountsMatcher$AccountsMatcherResult(elhz elhzVar, elhz elhzVar2, elhz elhzVar3) {
        this.c = elhzVar;
        this.a = elhzVar2;
        this.b = elhzVar3;
    }

    public static elhz a(Parcel parcel) {
        fgri fgriVar;
        dofi dofiVar;
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        elhx elhxVar = new elhx();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(createByteArray);
        while (true) {
            try {
                dofi dofiVar2 = dofi.a;
                fgqp fgqpVar = fgqp.a;
                fgti fgtiVar = fgti.a;
                fgqp fgqpVar2 = fgqp.a;
                try {
                    int read = byteArrayInputStream.read();
                    if (read == -1) {
                        fgriVar = null;
                    } else {
                        fgpx M = fgpx.M(new fgot(byteArrayInputStream, fgpx.K(read, byteArrayInputStream)));
                        fgriVar = dofiVar2.x();
                        try {
                            try {
                                try {
                                    try {
                                        fgtq b = fgti.a.b(fgriVar);
                                        b.l(fgriVar, fgpy.p(M), fgqpVar2);
                                        b.g(fgriVar);
                                        try {
                                            M.z(0);
                                        } catch (fgsd e) {
                                            throw e;
                                        }
                                    } catch (IOException e2) {
                                        if (e2.getCause() instanceof fgsd) {
                                            throw ((fgsd) e2.getCause());
                                        }
                                        throw new fgsd(e2);
                                    }
                                } catch (RuntimeException e3) {
                                    if (e3.getCause() instanceof fgsd) {
                                        throw ((fgsd) e3.getCause());
                                    }
                                    throw e3;
                                }
                            } catch (fguf e4) {
                                throw e4.a();
                            }
                        } catch (fgsd e5) {
                            if (e5.a) {
                                throw new fgsd(e5);
                            }
                            throw e5;
                        }
                    }
                    fgri.M(fgriVar);
                    dofiVar = (dofi) fgriVar;
                } catch (fgsd e6) {
                    if (e6.a) {
                        throw new fgsd(e6);
                    }
                    throw e6;
                } catch (IOException e7) {
                    throw new fgsd(e7);
                }
            } catch (IOException unused) {
                continue;
            }
            if (dofiVar == null) {
                return elhxVar.g();
            }
            elhxVar.c(dofiVar);
        }
    }

    public final boolean b() {
        return (this.a.isEmpty() || this.c.isEmpty() || !this.b.isEmpty()) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        elgo n = elgo.n(this.c, this.a, this.b);
        int i2 = ((elpg) n).c;
        for (int i3 = 0; i3 < i2; i3++) {
            elsn listIterator = ((elhz) n.get(i3)).listIterator();
            while (listIterator.hasNext()) {
                try {
                    ((dofi) listIterator.next()).nE(byteArrayOutputStream);
                } catch (IOException unused) {
                }
            }
            parcel.writeByteArray(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
        }
    }
}
