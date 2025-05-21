package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhpi;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ExperienceEventEntity extends GamesAbstractSafeParcelable implements ExperienceEvent {
    public static final Parcelable.Creator CREATOR = new bhpi();
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
        return arwb.b(experienceEvent.j(), this.a) && arwb.b(experienceEvent.g(), this.b) && arwb.b(experienceEvent.i(), this.c) && arwb.b(experienceEvent.h(), this.d) && arwb.b(experienceEvent.getIconImageUrl(), this.e) && arwb.b(experienceEvent.f(), this.f) && arwb.b(Long.valueOf(experienceEvent.c()), Long.valueOf(this.g)) && arwb.b(Long.valueOf(experienceEvent.e()), Long.valueOf(this.h)) && arwb.b(Long.valueOf(experienceEvent.d()), Long.valueOf(this.i)) && arwb.b(Integer.valueOf(experienceEvent.b()), Integer.valueOf(this.j)) && arwb.b(Integer.valueOf(experienceEvent.a()), Integer.valueOf(this.k));
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
        arwa.b("ExperienceId", this.a, arrayList);
        arwa.b("Game", this.b, arrayList);
        arwa.b("DisplayTitle", this.c, arrayList);
        arwa.b("DisplayDescription", this.d, arrayList);
        arwa.b("IconImageUrl", this.e, arrayList);
        arwa.b("IconImageUri", this.f, arrayList);
        arwa.b("CreatedTimestamp", Long.valueOf(this.g), arrayList);
        arwa.b("XpEarned", Long.valueOf(this.h), arrayList);
        arwa.b("CurrentXp", Long.valueOf(this.i), arrayList);
        arwa.b("Type", Integer.valueOf(this.j), arrayList);
        arwa.b("NewLevel", Integer.valueOf(this.k), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.q(parcel, 7, this.g);
        arxc.q(parcel, 8, this.h);
        arxc.q(parcel, 9, this.i);
        arxc.o(parcel, 10, this.j);
        arxc.o(parcel, 11, this.k);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
