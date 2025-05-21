package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bhjs;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PlayerLevel extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bhjs();
    public final int a;
    public final long b;
    public final long c;

    public PlayerLevel(int i, long j, long j2) {
        arwm.m(j >= 0, "Min XP must be positive!");
        arwm.m(j2 > j, "Max XP must be more than min XP!");
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
        return arwb.b(Integer.valueOf(playerLevel.a), Integer.valueOf(this.a)) && arwb.b(Long.valueOf(playerLevel.b), Long.valueOf(this.b)) && arwb.b(Long.valueOf(playerLevel.c), Long.valueOf(this.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("LevelNumber", Integer.valueOf(this.a), arrayList);
        arwa.b("MinXp", Long.valueOf(this.b), arrayList);
        arwa.b("MaxXp", Long.valueOf(this.c), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.q(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
