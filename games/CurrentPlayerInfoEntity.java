package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.bjnp;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CurrentPlayerInfoEntity extends GamesAbstractSafeParcelable implements CurrentPlayerInfo {
    public static final Parcelable.Creator CREATOR = new bjnp();
    public final int a;

    public CurrentPlayerInfoEntity(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CurrentPlayerInfo) {
            return obj == this || ((CurrentPlayerInfo) obj).a() == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("FriendsListVisibilityStatus", Integer.valueOf(this.a), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
