package com.google.android.gms.common.people.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ascb;
import defpackage.cvff;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AudienceMember extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ascb();
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    @Deprecated
    public final Bundle h;

    public AudienceMember(int i, int i2, int i3, String str, String str2, String str3, String str4, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = bundle;
    }

    public static AudienceMember a(String str, String str2) {
        Integer num = (Integer) cvff.a.get(str);
        return new AudienceMember(1, num == null ? -2 : num.intValue(), str, null, str2);
    }

    public final boolean b() {
        return this.b == 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudienceMember)) {
            return false;
        }
        AudienceMember audienceMember = (AudienceMember) obj;
        return this.a == audienceMember.a && this.b == audienceMember.b && this.c == audienceMember.c && arwb.b(this.d, audienceMember.d) && arwb.b(this.e, audienceMember.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        return !b() ? (this.b == 1 && this.c == -1) ? String.format("Circle [%s] %s", this.d, this.f) : String.format("Group [%s] %s", this.d, this.f) : String.format("Person [%s] %s", this.e, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.c);
        arxc.v(parcel, 3, this.d, false);
        arxc.v(parcel, 4, this.e, false);
        arxc.v(parcel, 5, this.f, false);
        arxc.v(parcel, 6, this.g, false);
        arxc.g(parcel, 7, this.h, false);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        arxc.c(parcel, a);
    }

    public AudienceMember(int i, int i2, String str, String str2, String str3) {
        this(1, i, i2, str, str2, str3, null, new Bundle());
    }
}
