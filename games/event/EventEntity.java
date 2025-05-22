package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjqx;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class EventEntity extends GamesAbstractSafeParcelable implements Event {
    public static final Parcelable.Creator CREATOR = new bjqx();
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
        return atyq.b(event.e(), this.a) && atyq.b(event.g(), this.b) && atyq.b(event.d(), this.c) && atyq.b(event.b(), this.d) && atyq.b(event.getIconImageUrl(), this.e) && atyq.b(event.c(), this.f) && atyq.b(Long.valueOf(event.a()), Long.valueOf(this.g)) && atyq.b(event.f(), this.h) && atyq.b(Boolean.valueOf(event.h()), Boolean.valueOf(this.i));
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
        atyp.b("Id", this.a, arrayList);
        atyp.b("Name", this.b, arrayList);
        atyp.b("Description", this.c, arrayList);
        atyp.b("IconImageUri", this.d, arrayList);
        atyp.b("IconImageUrl", this.e, arrayList);
        atyp.b("Player", this.f, arrayList);
        atyp.b("Value", Long.valueOf(this.g), arrayList);
        atyp.b("FormattedValue", this.h, arrayList);
        atyp.b("isVisible", Boolean.valueOf(this.i), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.q(parcel, 7, this.g);
        atzr.v(parcel, 8, this.h, false);
        atzr.e(parcel, 9, this.i);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
