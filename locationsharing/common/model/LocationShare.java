package com.google.android.gms.locationsharing.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.AudienceMember;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cars;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationShare extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cars();
    public final ShareTarget a;
    public final SharingCondition b;
    public int c;
    public final boolean d;

    public LocationShare(ShareTarget shareTarget, SharingCondition sharingCondition, int i, boolean z) {
        this.a = shareTarget;
        this.b = sharingCondition;
        this.c = i;
        this.d = z;
    }

    private final boolean c() {
        SharingCondition sharingCondition = this.b;
        return sharingCondition != null && sharingCondition.b() == 3;
    }

    public final String a() {
        ShareTarget shareTarget = this.a;
        AudienceMember audienceMember = shareTarget.a;
        return audienceMember == null ? shareTarget.b : audienceMember.f;
    }

    public final String b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationShare) {
            LocationShare locationShare = (LocationShare) obj;
            if (arwb.b(b(), locationShare.b()) && c() == locationShare.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b(), Boolean.valueOf(c())});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ShareTarget shareTarget = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, shareTarget, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.o(parcel, 4, this.c);
        arxc.e(parcel, 5, this.d);
        arxc.c(parcel, a);
    }
}
