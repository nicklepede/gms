package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bsmd;
import defpackage.ekvk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ExampleConsumption extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bsmd();
    public final String a;
    public final byte[] b;
    public final int c;
    public final byte[] d;
    public final byte[] e;

    public ExampleConsumption(String str, byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        boolean z = false;
        if (!ekvk.c(str) && bArr != null) {
            z = true;
        }
        atzb.c(z, "Collection name cannot be null or empty. Selection criteria cannot be null.");
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = bArr2;
        this.e = bArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExampleConsumption)) {
            return false;
        }
        ExampleConsumption exampleConsumption = (ExampleConsumption) obj;
        return this.a.equals(exampleConsumption.a) && Arrays.equals(this.b, exampleConsumption.b) && this.c == exampleConsumption.c && Arrays.equals(this.d, exampleConsumption.d) && Arrays.equals(this.e, exampleConsumption.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.i(parcel, 4, this.d, false);
        atzr.i(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
