package com.google.android.gms.locationsharing.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.AudienceMember;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cdai;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationShare extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cdai();
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
            if (atyq.b(b(), locationShare.b()) && c() == locationShare.c()) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, shareTarget, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.o(parcel, 4, this.c);
        atzr.e(parcel, 5, this.d);
        atzr.c(parcel, a);
    }
}
