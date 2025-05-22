package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjtx;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ExperienceEventEntity extends GamesAbstractSafeParcelable implements ExperienceEvent {
    public static final Parcelable.Creator CREATOR = new bjtx();
    public final String a;
    public final GameEntity b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public final long g;
    public final long h;
    public final long i;
    public final int j;
    public final int k;

    public ExperienceEventEntity(String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j, long j2, long j3, int i, int i2) {
        this.a = str;
        this.b = gameEntity;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = i;
        this.k = i2;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int a() {
        return this.k;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int b() {
        return this.j;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long c() {
        return this.g;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long d() {
        return this.i;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExperienceEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ExperienceEvent experienceEvent = (ExperienceEvent) obj;
        return atyq.b(experienceEvent.j(), this.a) && atyq.b(experienceEvent.g(), this.b) && atyq.b(experienceEvent.i(), this.c) && atyq.b(experienceEvent.h(), this.d) && atyq.b(experienceEvent.getIconImageUrl(), this.e) && atyq.b(experienceEvent.f(), this.f) && atyq.b(Long.valueOf(experienceEvent.c()), Long.valueOf(this.g)) && atyq.b(Long.valueOf(experienceEvent.e()), Long.valueOf(this.h)) && atyq.b(Long.valueOf(experienceEvent.d()), Long.valueOf(this.i)) && atyq.b(Integer.valueOf(experienceEvent.b()), Integer.valueOf(this.j)) && atyq.b(Integer.valueOf(experienceEvent.a()), Integer.valueOf(this.k));
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Uri f() {
        return this.f;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Game g() {
        return this.b;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String getIconImageUrl() {
        return this.e;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k)});
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String i() {
        return this.c;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String j() {
        return this.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("ExperienceId", this.a, arrayList);
        atyp.b("Game", this.b, arrayList);
        atyp.b("DisplayTitle", this.c, arrayList);
        atyp.b("DisplayDescription", this.d, arrayList);
        atyp.b("IconImageUrl", this.e, arrayList);
        atyp.b("IconImageUri", this.f, arrayList);
        atyp.b("CreatedTimestamp", Long.valueOf(this.g), arrayList);
        atyp.b("XpEarned", Long.valueOf(this.h), arrayList);
        atyp.b("CurrentXp", Long.valueOf(this.i), arrayList);
        atyp.b("Type", Integer.valueOf(this.j), arrayList);
        atyp.b("NewLevel", Integer.valueOf(this.k), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.q(parcel, 7, this.g);
        atzr.q(parcel, 8, this.h);
        atzr.q(parcel, 9, this.i);
        atzr.o(parcel, 10, this.j);
        atzr.o(parcel, 11, this.k);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
