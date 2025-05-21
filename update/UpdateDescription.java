package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dhec;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UpdateDescription extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhec();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public UpdateDescription(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UpdateDescription)) {
            return false;
        }
        UpdateDescription updateDescription = (UpdateDescription) obj;
        return updateDescription.a.equals(this.a) && updateDescription.b.equals(this.b) && updateDescription.c.equals(this.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("title", this.a, arrayList);
        arwa.b("description", this.b, arrayList);
        arwa.b("size", this.c, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
