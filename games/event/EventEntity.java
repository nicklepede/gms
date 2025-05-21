package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhmi;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class EventEntity extends GamesAbstractSafeParcelable implements Event {
    public static final Parcelable.Creator CREATOR = new bhmi();
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final String e;
    public final PlayerEntity f;
    public final long g;
    public final String h;
    public final boolean i;

    public EventEntity(String str, String str2, String str3, Uri uri, String str4, Player player, long j, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = str4;
        this.f = new PlayerEntity(player);
        this.g = j;
        this.h = str5;
        this.i = z;
    }

    @Override // com.google.android.gms.games.event.Event
    public final long a() {
        return this.g;
    }

    @Override // com.google.android.gms.games.event.Event
    public final Uri b() {
        return this.d;
    }

    @Override // com.google.android.gms.games.event.Event
    public final Player c() {
        return this.f;
    }

    @Override // com.google.android.gms.games.event.Event
    public final String d() {
        return this.c;
    }

    @Override // com.google.android.gms.games.event.Event
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Event event = (Event) obj;
        return arwb.b(event.e(), this.a) && arwb.b(event.g(), this.b) && arwb.b(event.d(), this.c) && arwb.b(event.b(), this.d) && arwb.b(event.getIconImageUrl(), this.e) && arwb.b(event.c(), this.f) && arwb.b(Long.valueOf(event.a()), Long.valueOf(this.g)) && arwb.b(event.f(), this.h) && arwb.b(Boolean.valueOf(event.h()), Boolean.valueOf(this.i));
    }

    @Override // com.google.android.gms.games.event.Event
    public final String f() {
        return this.h;
    }

    @Override // com.google.android.gms.games.event.Event
    public final String g() {
        return this.b;
    }

    @Override // com.google.android.gms.games.event.Event
    public final String getIconImageUrl() {
        return this.e;
    }

    @Override // com.google.android.gms.games.event.Event
    public final boolean h() {
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Long.valueOf(this.g), this.h, Boolean.valueOf(this.i)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("Id", this.a, arrayList);
        arwa.b("Name", this.b, arrayList);
        arwa.b("Description", this.c, arrayList);
        arwa.b("IconImageUri", this.d, arrayList);
        arwa.b("IconImageUrl", this.e, arrayList);
        arwa.b("Player", this.f, arrayList);
        arwa.b("Value", Long.valueOf(this.g), arrayList);
        arwa.b("FormattedValue", this.h, arrayList);
        arwa.b("isVisible", Boolean.valueOf(this.i), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.q(parcel, 7, this.g);
        arxc.v(parcel, 8, this.h, false);
        arxc.e(parcel, 9, this.i);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
