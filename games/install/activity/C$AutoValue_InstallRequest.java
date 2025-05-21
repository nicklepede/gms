package com.google.android.gms.games.install.activity;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.games.install.activity.$AutoValue_InstallRequest, reason: invalid class name */
/* loaded from: classes4.dex */
abstract class C$AutoValue_InstallRequest extends InstallRequest {
    public final String a;
    public final String b;

    public C$AutoValue_InstallRequest(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null requesterPackageName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null requesterGameServicesId");
        }
        this.b = str2;
    }

    @Override // com.google.android.gms.games.install.activity.InstallRequest
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.gms.games.install.activity.InstallRequest
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallRequest) {
            InstallRequest installRequest = (InstallRequest) obj;
            if (this.a.equals(installRequest.b()) && this.b.equals(installRequest.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "InstallRequest{requesterPackageName=" + this.a + ", requesterGameServicesId=" + this.b + "}";
    }
}
