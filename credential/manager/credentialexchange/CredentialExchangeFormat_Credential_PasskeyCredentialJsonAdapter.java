package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipo;
import defpackage.fipt;
import defpackage.fipu;
import defpackage.fipw;
import defpackage.fiqb;
import defpackage.fiqq;
import defpackage.firp;
import defpackage.fuwy;
import defpackage.fvbo;
import java.lang.reflect.Constructor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_Credential_PasskeyCredentialJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;
    private volatile Constructor d;

    public CredentialExchangeFormat_Credential_PasskeyCredentialJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("credentialId", "rpId", "userName", "userDisplayName", "userHandle", "key", "fido2Extensions");
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(String.class, fuwyVar, "credentialId");
        this.c = fiqqVar.d(CredentialExchangeFormat$Fido2Extensions.class, fuwyVar, "fido2Extensions");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        CredentialExchangeFormat$Fido2Extensions credentialExchangeFormat$Fido2Extensions = null;
        while (fipwVar.o()) {
            String str7 = str;
            switch (fipwVar.c(this.a)) {
                case -1:
                    fipwVar.m();
                    fipwVar.n();
                    break;
                case 0:
                    str = (String) this.b.a(fipwVar);
                    if (str == null) {
                        throw firp.c("credentialId", "credentialId", fipwVar);
                    }
                    continue;
                case 1:
                    str2 = (String) this.b.a(fipwVar);
                    if (str2 == null) {
                        throw firp.c("rpId", "rpId", fipwVar);
                    }
                    break;
                case 2:
                    str3 = (String) this.b.a(fipwVar);
                    if (str3 == null) {
                        throw firp.c("userName", "userName", fipwVar);
                    }
                    break;
                case 3:
                    str4 = (String) this.b.a(fipwVar);
                    if (str4 == null) {
                        throw firp.c("userDisplayName", "userDisplayName", fipwVar);
                    }
                    break;
                case 4:
                    str5 = (String) this.b.a(fipwVar);
                    if (str5 == null) {
                        throw firp.c("userHandle", "userHandle", fipwVar);
                    }
                    break;
                case 5:
                    str6 = (String) this.b.a(fipwVar);
                    if (str6 == null) {
                        throw firp.c("key", "key", fipwVar);
                    }
                    break;
                case 6:
                    credentialExchangeFormat$Fido2Extensions = (CredentialExchangeFormat$Fido2Extensions) this.c.a(fipwVar);
                    str = str7;
                    i = -65;
                    continue;
            }
            str = str7;
        }
        String str8 = str;
        fipwVar.k();
        if (i == -65) {
            if (str8 == null) {
                throw firp.b("credentialId", "credentialId", fipwVar);
            }
            if (str2 == null) {
                throw firp.b("rpId", "rpId", fipwVar);
            }
            if (str3 == null) {
                throw firp.b("userName", "userName", fipwVar);
            }
            if (str4 == null) {
                throw firp.b("userDisplayName", "userDisplayName", fipwVar);
            }
            if (str5 == null) {
                throw firp.b("userHandle", "userHandle", fipwVar);
            }
            if (str6 != null) {
                return new CredentialExchangeFormat$Credential$PasskeyCredential(str8, str2, str3, str4, str5, str6, credentialExchangeFormat$Fido2Extensions);
            }
            throw firp.b("key", "key", fipwVar);
        }
        Constructor constructor = this.d;
        int i2 = i;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            fvbo.c(cls);
            Class cls2 = firp.d;
            fvbo.c(cls2);
            constructor = CredentialExchangeFormat$Credential$PasskeyCredential.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, CredentialExchangeFormat$Fido2Extensions.class, cls, cls2);
            fvbo.e(constructor, "getDeclaredConstructor(...)");
            this.d = constructor;
        }
        if (str8 == null) {
            throw firp.b("credentialId", "credentialId", fipwVar);
        }
        if (str2 == null) {
            throw firp.b("rpId", "rpId", fipwVar);
        }
        if (str3 == null) {
            throw firp.b("userName", "userName", fipwVar);
        }
        if (str4 == null) {
            throw firp.b("userDisplayName", "userDisplayName", fipwVar);
        }
        if (str5 == null) {
            throw firp.b("userHandle", "userHandle", fipwVar);
        }
        if (str6 == null) {
            throw firp.b("key", "key", fipwVar);
        }
        Object newInstance = constructor.newInstance(str8, str2, str3, str4, str5, str6, credentialExchangeFormat$Fido2Extensions, Integer.valueOf(i2), null);
        fvbo.e(newInstance, "newInstance(...)");
        return (CredentialExchangeFormat$Credential$PasskeyCredential) newInstance;
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Credential$PasskeyCredential credentialExchangeFormat$Credential$PasskeyCredential = (CredentialExchangeFormat$Credential$PasskeyCredential) obj;
        if (credentialExchangeFormat$Credential$PasskeyCredential == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("credentialId");
        fipo fipoVar = this.b;
        fipoVar.b(fiqbVar, credentialExchangeFormat$Credential$PasskeyCredential.a);
        fiqbVar.j("rpId");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Credential$PasskeyCredential.b);
        fiqbVar.j("userName");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Credential$PasskeyCredential.c);
        fiqbVar.j("userDisplayName");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Credential$PasskeyCredential.d);
        fiqbVar.j("userHandle");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Credential$PasskeyCredential.e);
        fiqbVar.j("key");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Credential$PasskeyCredential.f);
        fiqbVar.j("fido2Extensions");
        this.c.b(fiqbVar, credentialExchangeFormat$Credential$PasskeyCredential.g);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Credential.PasskeyCredential)";
    }
}
