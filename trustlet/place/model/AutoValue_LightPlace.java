package com.google.android.gms.trustlet.place.model;

import com.google.android.gms.maps.model.LatLng;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class AutoValue_LightPlace extends LightPlace {
    private final String a;
    private final String b;
    private final LatLng c;
    private final String d;

    public AutoValue_LightPlace(String str, String str2, LatLng latLng, String str3) {
        this.a = str;
        this.b = str2;
        this.c = latLng;
        this.d = str3;
    }

    @Override // com.google.android.gms.trustlet.place.model.LightPlace
    public final LatLng a() {
        return this.c;
    }

    @Override // com.google.android.gms.trustlet.place.model.LightPlace
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.gms.trustlet.place.model.LightPlace
    public final String c() {
        return this.b;
    }

    @Override // com.google.android.gms.trustlet.place.model.LightPlace
    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        LatLng latLng;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LightPlace) {
            LightPlace lightPlace = (LightPlace) obj;
            if (lightPlace.describeContents() == 0 && this.a.equals(lightPlace.b()) && this.b.equals(lightPlace.c()) && ((latLng = this.c) != null ? latLng.equals(lightPlace.a()) : lightPlace.a() == null) && this.d.equals(lightPlace.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b.hashCode();
        LatLng latLng = this.c;
        return (((hashCode * 1000003) ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "LightPlace{describeContents=0, address=" + this.a + ", id=" + this.b + ", latLng=" + String.valueOf(this.c) + ", name=" + this.d + "}";
    }
}
