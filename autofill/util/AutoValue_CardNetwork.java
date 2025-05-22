package com.google.android.gms.autofill.util;

import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutoValue_CardNetwork extends C$AutoValue_CardNetwork {
    private volatile transient Pattern a;
    private volatile transient boolean b;

    public AutoValue_CardNetwork(final int i, final String str) {
        new CardNetwork(i, str) { // from class: com.google.android.gms.autofill.util.$AutoValue_CardNetwork
            private final int a;
            private final String b;

            {
                this.a = i;
                if (str == null) {
                    throw new NullPointerException("Null binRegex");
                }
                this.b = str;
            }

            @Override // com.google.android.gms.autofill.util.CardNetwork
            public final int a() {
                return this.a;
            }

            @Override // com.google.android.gms.autofill.util.CardNetwork
            public final String b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof CardNetwork) {
                    CardNetwork cardNetwork = (CardNetwork) obj;
                    if (this.a == cardNetwork.a() && this.b.equals(cardNetwork.b())) {
                        return true;
                    }
                }
                return false;
            }

            public final int hashCode() {
                return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
            }

            public final String toString() {
                return "CardNetwork{type=" + this.a + ", binRegex=" + this.b + "}";
            }
        };
    }

    @Override // com.google.android.gms.autofill.util.CardNetwork
    public final Pattern c() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.a = super.c();
                    this.b = true;
                }
            }
        }
        return this.a;
    }
}
