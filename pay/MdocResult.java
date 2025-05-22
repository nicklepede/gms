package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvmh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class MdocResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvmh();
    public String a;
    public byte[] b;
    public EncryptionParameters c;

    private MdocResult() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdocResult) {
            MdocResult mdocResult = (MdocResult) obj;
            if (atyq.b(this.a, mdocResult.a) && Arrays.equals(this.b, mdocResult.b) && atyq.b(this.c, mdocResult.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public MdocResult(String str, byte[] bArr, EncryptionParameters encryptionParameters) {
        this.a = str;
        this.b = bArr;
        this.c = encryptionParameters;
    }
}
