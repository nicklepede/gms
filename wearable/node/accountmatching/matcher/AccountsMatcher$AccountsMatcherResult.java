package com.google.android.gms.wearable.node.accountmatching.matcher;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dlca;
import defpackage.dltr;
import defpackage.eitj;
import defpackage.eius;
import defpackage.eiuu;
import defpackage.ejcb;
import defpackage.ejfg;
import defpackage.feaa;
import defpackage.febe;
import defpackage.febf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.feex;
import defpackage.fefm;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class AccountsMatcher$AccountsMatcherResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dlca();
    public final eiuu a;
    public final eiuu b;
    private final eiuu c;

    public AccountsMatcher$AccountsMatcherResult(eiuu eiuuVar, eiuu eiuuVar2, eiuu eiuuVar3) {
        this.c = eiuuVar;
        this.a = eiuuVar2;
        this.b = eiuuVar3;
    }

    public static eiuu a(Parcel parcel) {
        fecp fecpVar;
        dltr dltrVar;
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        eius eiusVar = new eius();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(createByteArray);
        while (true) {
            try {
                dltr dltrVar2 = dltr.a;
                febw febwVar = febw.a;
                feep feepVar = feep.a;
                febw febwVar2 = febw.a;
                try {
                    int read = byteArrayInputStream.read();
                    if (read == -1) {
                        fecpVar = null;
                    } else {
                        febe M = febe.M(new feaa(byteArrayInputStream, febe.K(read, byteArrayInputStream)));
                        fecpVar = dltrVar2.x();
                        try {
                            try {
                                try {
                                    feex b = feep.a.b(fecpVar);
                                    b.l(fecpVar, febf.p(M), febwVar2);
                                    b.g(fecpVar);
                                    try {
                                        M.z(0);
                                    } catch (fedk e) {
                                        throw e;
                                    }
                                } catch (fefm e2) {
                                    throw e2.a();
                                } catch (RuntimeException e3) {
                                    if (e3.getCause() instanceof fedk) {
                                        throw ((fedk) e3.getCause());
                                    }
                                    throw e3;
                                }
                            } catch (fedk e4) {
                                if (e4.a) {
                                    throw new fedk(e4);
                                }
                                throw e4;
                            }
                        } catch (IOException e5) {
                            if (e5.getCause() instanceof fedk) {
                                throw ((fedk) e5.getCause());
                            }
                            throw new fedk(e5);
                        }
                    }
                    fecp.M(fecpVar);
                    dltrVar = (dltr) fecpVar;
                } catch (fedk e6) {
                    if (e6.a) {
                        throw new fedk(e6);
                    }
                    throw e6;
                } catch (IOException e7) {
                    throw new fedk(e7);
                }
            } catch (IOException unused) {
                continue;
            }
            if (dltrVar == null) {
                return eiusVar.g();
            }
            eiusVar.c(dltrVar);
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
        eitj n = eitj.n(this.c, this.a, this.b);
        int i2 = ((ejcb) n).c;
        for (int i3 = 0; i3 < i2; i3++) {
            ejfg listIterator = ((eiuu) n.get(i3)).listIterator();
            while (listIterator.hasNext()) {
                try {
                    ((dltr) listIterator.next()).nh(byteArrayOutputStream);
                } catch (IOException unused) {
                }
            }
            parcel.writeByteArray(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
        }
    }
}
