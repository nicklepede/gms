package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atau;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjud;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ProfileSettingsEntity extends GamesAbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new bjud();
    public final Status a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final StockProfileImageEntity f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;
    public final boolean n;
    public final ProfilelessRecallSummary o;
    public final Boolean p;

    public ProfileSettingsEntity(Status status, String str, boolean z, boolean z2, boolean z3, StockProfileImageEntity stockProfileImageEntity, boolean z4, boolean z5, int i, boolean z6, boolean z7, int i2, int i3, boolean z8, ProfilelessRecallSummary profilelessRecallSummary, Boolean bool) {
        this.a = status;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = stockProfileImageEntity;
        this.g = z4;
        this.h = z5;
        this.i = i;
        this.j = z6;
        this.k = z7;
        this.l = i2;
        this.m = i3;
        this.n = z8;
        this.o = profilelessRecallSummary;
        this.p = bool;
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ProfileSettingsEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ProfileSettingsEntity profileSettingsEntity = (ProfileSettingsEntity) obj;
        if (atyq.b(this.b, profileSettingsEntity.b)) {
            if (atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(profileSettingsEntity.c))) {
                if (atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(profileSettingsEntity.d))) {
                    if (atyq.b(Boolean.valueOf(this.e), Boolean.valueOf(profileSettingsEntity.e)) && atyq.b(this.a, profileSettingsEntity.a) && atyq.b(this.f, profileSettingsEntity.f)) {
                        if (atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(profileSettingsEntity.g))) {
                            if (atyq.b(Boolean.valueOf(this.h), Boolean.valueOf(profileSettingsEntity.h)) && this.i == profileSettingsEntity.i && this.j == profileSettingsEntity.j && this.k == profileSettingsEntity.k && this.l == profileSettingsEntity.l && this.m == profileSettingsEntity.m && this.n == profileSettingsEntity.n && atyq.b(this.p, profileSettingsEntity.p) && atyq.b(this.o, profileSettingsEntity.o)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.a, this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m), Boolean.valueOf(this.n), this.o, this.p});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("GamerTag", this.b, arrayList);
        atyp.b("IsGamerTagExplicitlySet", Boolean.valueOf(this.c), arrayList);
        atyp.b("IsProfileVisible", Boolean.valueOf(this.d), arrayList);
        atyp.b("IsVisibilityExplicitlySet", Boolean.valueOf(this.e), arrayList);
        atyp.b("Status", this.a, arrayList);
        atyp.b("StockProfileImage", this.f, arrayList);
        atyp.b("IsProfileDiscoverable", Boolean.valueOf(this.g), arrayList);
        atyp.b("AutoSignIn", Boolean.valueOf(this.h), arrayList);
        atyp.b("httpErrorCode", Integer.valueOf(this.i), arrayList);
        atyp.b("IsSettingsChangesProhibited", Boolean.valueOf(this.j), arrayList);
        atyp.b("AllowFriendInvites", Boolean.valueOf(this.k), arrayList);
        atyp.b("ProfileVisibility", Integer.valueOf(this.l), arrayList);
        atyp.b("global_friends_list_visibility", Integer.valueOf(this.m), arrayList);
        atyp.b("always_auto_sign_in", Boolean.valueOf(this.n), arrayList);
        atyp.b("profileless_recall_summary", this.o, arrayList);
        atyp.b("games_streaks_enabled", this.p, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, status, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.e(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.o(parcel, 9, this.i);
        atzr.e(parcel, 10, this.j);
        atzr.e(parcel, 11, this.k);
        atzr.o(parcel, 12, this.l);
        atzr.o(parcel, 13, this.m);
        atzr.e(parcel, 14, this.n);
        atzr.t(parcel, 15, this.o, i, false);
        atzr.z(parcel, 16, this.p);
        atzr.c(parcel, a);
    }
}
