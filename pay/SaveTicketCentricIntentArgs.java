package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvne;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SaveTicketCentricIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvne();
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
            if (atyq.b(this.a, saveTicketCentricIntentArgs.a) && atyq.b(Long.valueOf(this.b), Long.valueOf(saveTicketCentricIntentArgs.b)) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(saveTicketCentricIntentArgs.c)) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(saveTicketCentricIntentArgs.d)) && atyq.b(this.e, saveTicketCentricIntentArgs.e) && atyq.b(this.f, saveTicketCentricIntentArgs.f) && Arrays.equals(this.g, saveTicketCentricIntentArgs.g) && atyq.b(this.h, saveTicketCentricIntentArgs.h)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.q(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.i(parcel, 7, this.g, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.c(parcel, a);
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
