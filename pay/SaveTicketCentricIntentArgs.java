package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctdz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SaveTicketCentricIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctdz();
    public ProtoSafeParcelable a;
    public long b;
    public boolean c;
    public int d;
    public ProtoSafeParcelable e;
    public String f;
    public byte[] g;
    public ProtoSafeParcelable h;

    private SaveTicketCentricIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveTicketCentricIntentArgs) {
            SaveTicketCentricIntentArgs saveTicketCentricIntentArgs = (SaveTicketCentricIntentArgs) obj;
            if (arwb.b(this.a, saveTicketCentricIntentArgs.a) && arwb.b(Long.valueOf(this.b), Long.valueOf(saveTicketCentricIntentArgs.b)) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(saveTicketCentricIntentArgs.c)) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(saveTicketCentricIntentArgs.d)) && arwb.b(this.e, saveTicketCentricIntentArgs.e) && arwb.b(this.f, saveTicketCentricIntentArgs.f) && Arrays.equals(this.g, saveTicketCentricIntentArgs.g) && arwb.b(this.h, saveTicketCentricIntentArgs.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, Integer.valueOf(Arrays.hashCode(this.g)), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.q(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.i(parcel, 7, this.g, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.c(parcel, a);
    }

    public SaveTicketCentricIntentArgs(ProtoSafeParcelable protoSafeParcelable, long j, boolean z, int i, ProtoSafeParcelable protoSafeParcelable2, String str, byte[] bArr, ProtoSafeParcelable protoSafeParcelable3) {
        this.a = protoSafeParcelable;
        this.b = j;
        this.c = z;
        this.d = i;
        this.e = protoSafeParcelable2;
        this.f = str;
        this.g = bArr;
        this.h = protoSafeParcelable3;
    }
}
