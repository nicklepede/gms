package com.google.android.gms.locationsharing.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.AudienceMember;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.caru;
import defpackage.carv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ShareTarget extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new carv();
    public final AudienceMember a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public ShareTarget(AudienceMember audienceMember, String str, String str2, String str3, int i) {
        this.a = audienceMember;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public final caru a() {
        return caru.values()[this.e];
    }

    public final String b() {
        if (c()) {
            return this.c;
        }
        if (a() == caru.GAIA) {
            AudienceMember audienceMember = this.a;
            if (audienceMember.b()) {
                return audienceMember.e.substring(2);
            }
        }
        return this.a.d;
    }

    public final boolean c() {
        return a().g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShareTarget) {
            return arwb.b(b(), ((ShareTarget) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AudienceMember audienceMember = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, audienceMember, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
