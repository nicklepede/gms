package com.google.android.gms.locationsharing.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.AudienceMember;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cdak;
import defpackage.cdal;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ShareTarget extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdal();
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

    public final cdak a() {
        return cdak.values()[this.e];
    }

    public final String b() {
        if (c()) {
            return this.c;
        }
        if (a() == cdak.GAIA) {
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
            return atyq.b(b(), ((ShareTarget) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AudienceMember audienceMember = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, audienceMember, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
