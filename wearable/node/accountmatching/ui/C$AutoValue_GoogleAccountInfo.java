package com.google.android.gms.wearable.node.accountmatching.ui;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.wearable.node.accountmatching.ui.$AutoValue_GoogleAccountInfo, reason: invalid class name */
/* loaded from: classes7.dex */
abstract class C$AutoValue_GoogleAccountInfo extends GoogleAccountInfo {
    public final String a;
    public final boolean b;

    public C$AutoValue_GoogleAccountInfo(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null email");
        }
        this.a = str;
        this.b = z;
    }

    @Override // com.google.android.gms.wearable.node.accountmatching.ui.GoogleAccountInfo
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.wearable.node.accountmatching.ui.GoogleAccountInfo
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleAccountInfo) {
            GoogleAccountInfo googleAccountInfo = (GoogleAccountInfo) obj;
            if (this.a.equals(googleAccountInfo.a()) && this.b == googleAccountInfo.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "GoogleAccountInfo{email=" + this.a + ", signedIn=" + this.b + "}";
    }
}
