package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bqen;
import defpackage.eiif;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ExampleConsumption extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqen();
    public final String a;
    public final byte[] b;
    public final int c;
    public final byte[] d;
    public final byte[] e;

    public ExampleConsumption(String str, byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        boolean z = false;
        if (!eiif.c(str) && bArr != null) {
            z = true;
        }
        arwm.c(z, "Collection name cannot be null or empty. Selection criteria cannot be null.");
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.i(parcel, 4, this.d, false);
        arxc.i(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
