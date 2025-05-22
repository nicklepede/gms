package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bjoh;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PlayerLevel extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bjoh();
    public final int a;
    public final long b;
    public final long c;

    public PlayerLevel(int i, long j, long j2) {
        atzb.m(j >= 0, "Min XP must be positive!");
        atzb.m(j2 > j, "Max XP must be more than min XP!");
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerLevel playerLevel = (PlayerLevel) obj;
        return atyq.b(Integer.valueOf(playerLevel.a), Integer.valueOf(this.a)) && atyq.b(Long.valueOf(playerLevel.b), Long.valueOf(this.b)) && atyq.b(Long.valueOf(playerLevel.c), Long.valueOf(this.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("LevelNumber", Integer.valueOf(this.a), arrayList);
        atyp.b("MinXp", Long.valueOf(this.b), arrayList);
        atyp.b("MaxXp", Long.valueOf(this.c), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.q(parcel, 2, this.b);
        atzr.q(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
