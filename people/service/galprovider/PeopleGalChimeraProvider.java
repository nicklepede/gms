package com.google.android.gms.people.service.galprovider;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.google.android.chimera.ContentProvider;
import com.google.android.chimera.ModuleContext;
import com.google.android.gms.R;
import defpackage.a;
import defpackage.anxo;
import defpackage.arts;
import defpackage.bqna;
import defpackage.ctki;
import defpackage.ctkm;
import defpackage.ctpe;
import defpackage.cuey;
import defpackage.cugp;
import defpackage.cugw;
import defpackage.cuhi;
import defpackage.cuhj;
import defpackage.cuhk;
import defpackage.cuhq;
import defpackage.cuty;
import defpackage.cuye;
import defpackage.egfq;
import defpackage.eggz;
import defpackage.eghi;
import defpackage.ekxd;
import defpackage.ellz;
import defpackage.etyn;
import defpackage.etzl;
import defpackage.etzm;
import defpackage.etzq;
import defpackage.euap;
import defpackage.euat;
import defpackage.euax;
import defpackage.euaz;
import defpackage.euba;
import defpackage.febz;
import defpackage.feca;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.frfn;
import defpackage.ftye;
import defpackage.unx;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PeopleGalChimeraProvider extends ContentProvider {
    private static final UriMatcher b;
    public cugw a;
    private final ArrayDeque c = new ArrayDeque();
    private bqna d;
    private Context e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "directories", 0);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/filter/*", 1);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/lookup/*/entities", 2);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/lookup/*/#/entities", 3);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "data/emails/filter/*", 4);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "data/phones/filter/*", 5);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "phone_lookup/*", 6);
        b = uriMatcher;
    }

    public PeopleGalChimeraProvider() {
    }

    public static Uri a(String str, boolean z, String str2, boolean z2) {
        Uri build = new Uri.Builder().scheme("content").authority(true != z2 ? "com.google.contacts.gal.provider" : "com.google.android.gms.people.gal.provider").appendEncodedPath("people_photo/").appendQueryParameter("account_name", str).appendQueryParameter("lookup", str2).build();
        return z ? build.buildUpon().appendQueryParameter("sz", Long.toString(frfn.d())).build() : build;
    }

    public static boolean c(eggz eggzVar) {
        return eggzVar.g.size() > 0 && !((eghi) eggzVar.g.get(0)).e;
    }

    public static void f(fecj fecjVar, Throwable th) {
        if (frfn.a.a().t()) {
            String a = ctki.a(th);
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekxd ekxdVar = (ekxd) fecjVar.b;
            ekxd ekxdVar2 = ekxd.a;
            a.getClass();
            ekxdVar.b |= 128;
            ekxdVar.h = a;
        }
    }

    public static final String g(Uri uri) {
        return Build.VERSION.SDK_INT < 26 ? "" : uri.getQueryParameter("callerPackage");
    }

    private static boolean h(Context context) {
        return frfn.a.a().v() ? cuty.a(context).b() : cuty.a(context).c();
    }

    private final Cursor i(String[] strArr, boolean z, fecj fecjVar) {
        int i;
        int i2;
        if (!z) {
            if (frfn.j()) {
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                ekxd ekxdVar = (ekxd) fecjVar.b;
                ekxd ekxdVar2 = ekxd.a;
                ekxdVar.d = 17;
                ekxdVar.b |= 2;
            }
            throw new UnsupportedOperationException();
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        for (Account account : this.d.p("com.google")) {
            String.valueOf(account);
            String str = account.name;
            if (!str.endsWith("@gmail.com") && !str.endsWith("@googlemail.com")) {
                Object[] objArr = new Object[strArr.length];
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    String str2 = strArr[i3];
                    if ("accountName".equals(str2)) {
                        objArr[i3] = str;
                    } else if ("accountType".equals(str2)) {
                        objArr[i3] = account.type;
                    } else {
                        if ("typeResourceId".equals(str2)) {
                            if (frfn.h()) {
                                if (!fecjVar.b.L()) {
                                    fecjVar.U();
                                }
                                ekxd ekxdVar3 = (ekxd) fecjVar.b;
                                ekxd ekxdVar4 = ekxd.a;
                                i = 0;
                                ekxdVar3.b |= 256;
                                ekxdVar3.i = R.string.directory_name;
                            } else {
                                i = 0;
                            }
                            try {
                                if (frfn.k()) {
                                    i2 = anxo.a(this.e, R.string.directory_name);
                                    objArr[i3] = Integer.valueOf(i2);
                                } else {
                                    objArr[i3] = Integer.valueOf(R.string.directory_name);
                                    if (frfn.i()) {
                                        Context context = this.e;
                                        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
                                        if ((moduleContext == null ? context.getResources().getResourceName(R.string.directory_name) : moduleContext.getContainerResources().getResourceName(anxo.a(moduleContext, R.string.directory_name))) == null) {
                                            cuey.c("PeopleGalProvider", "Resource not found for directory_name");
                                            if (!fecjVar.b.L()) {
                                                fecjVar.U();
                                            }
                                            ekxd ekxdVar5 = (ekxd) fecjVar.b;
                                            ekxd ekxdVar6 = ekxd.a;
                                            ekxdVar5.d = 18;
                                            ekxdVar5.b |= 2;
                                        }
                                    }
                                    i2 = i;
                                }
                                if (frfn.h() && i2 != 0) {
                                    if (!fecjVar.b.L()) {
                                        fecjVar.U();
                                    }
                                    ekxd ekxdVar7 = (ekxd) fecjVar.b;
                                    ekxd ekxdVar8 = ekxd.a;
                                    ekxdVar7.b |= 512;
                                    ekxdVar7.j = i2;
                                }
                            } catch (Resources.NotFoundException unused) {
                                if (frfn.k() && frfn.i()) {
                                    objArr[i3] = Integer.valueOf(i);
                                    cuey.c("PeopleGalProvider", "Resource not found for directory_name");
                                    if (!fecjVar.b.L()) {
                                        fecjVar.U();
                                    }
                                    ekxd ekxdVar9 = (ekxd) fecjVar.b;
                                    ekxd ekxdVar10 = ekxd.a;
                                    ekxdVar9.d = 18;
                                    ekxdVar9.b |= 2;
                                }
                            }
                        } else if ("displayName".equals(str2)) {
                            int indexOf = str.indexOf(64);
                            if (indexOf == -1 || indexOf >= str.length() - 2) {
                                objArr[i3] = str;
                            } else {
                                objArr[i3] = Character.toUpperCase(str.charAt(indexOf + 1)) + str.substring(indexOf + 2);
                            }
                        } else if ("exportSupport".equals(str2)) {
                            objArr[i3] = 1;
                        } else if ("shortcutSupport".equals(str2)) {
                            objArr[i3] = 0;
                        } else if ("photoSupport".equals(str2)) {
                            objArr[i3] = 3;
                        }
                    }
                }
                matrixCursor.addRow(objArr);
            }
        }
        if (frfn.j()) {
            int count = matrixCursor.getCount();
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekxd ekxdVar11 = (ekxd) fecjVar.b;
            ekxd ekxdVar12 = ekxd.a;
            ekxdVar11.b |= 32;
            ekxdVar11.g = count;
        }
        return matrixCursor;
    }

    private final Cursor j(Uri uri, final int i, final String[] strArr, final String str, final Account account, final boolean z, final fecj fecjVar) {
        String queryParameter = uri.getQueryParameter("limit");
        long a = frfn.a.a().a();
        if (queryParameter != null) {
            try {
                a = Long.parseLong(queryParameter);
            } catch (NumberFormatException e) {
                f(fecjVar, e);
                cuey.l("PeopleGalProvider", a.a(queryParameter, "query: invalid limit parameter: '", "'"));
            }
        }
        final long j = a;
        final boolean z2 = i == 5;
        final String encode = Uri.encode(uri.getLastPathSegment());
        final String g = g(uri);
        return (Cursor) cuhi.a(this.c, new Callable() { // from class: cuhp
            /* JADX WARN: Removed duplicated region for block: B:114:0x02a3  */
            /* JADX WARN: Removed duplicated region for block: B:116:0x02aa  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x02b0  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x02b4  */
            /* JADX WARN: Removed duplicated region for block: B:131:0x02ff  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x0309  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x0316  */
            /* JADX WARN: Removed duplicated region for block: B:174:0x0556  */
            /* JADX WARN: Removed duplicated region for block: B:177:0x05d0  */
            /* JADX WARN: Removed duplicated region for block: B:181:0x0658 A[EDGE_INSN: B:181:0x0658->B:182:0x0658 BREAK  A[LOOP:1: B:92:0x0224->B:107:0x0620], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:193:0x0559  */
            /* JADX WARN: Removed duplicated region for block: B:196:0x044f  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 1826
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cuhp.call():java.lang.Object");
            }
        }, "GalFilterThread", frfn.b());
    }

    public final arts b(Account account) {
        arts a = cugp.a(this.e, account);
        if (this.a == null) {
            Context context = this.e;
            this.a = cugw.a(context, context.getApplicationInfo().uid);
        }
        return a;
    }

    public final Account d(String str, fecj fecjVar) {
        if (str == null) {
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekxd ekxdVar = (ekxd) fecjVar.b;
            ekxd ekxdVar2 = ekxd.a;
            ekxdVar.d = 4;
            ekxdVar.b |= 2;
            cuey.c("PeopleGalProvider", "Account name cannot be null.");
            return null;
        }
        for (Account account : this.d.p("com.google")) {
            if (account.name.equals(str)) {
                return account;
            }
        }
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekxd ekxdVar3 = (ekxd) fecjVar.b;
        ekxd ekxdVar4 = ekxd.a;
        ekxdVar3.d = 5;
        ekxdVar3.b |= 2;
        cuey.c("PeopleGalProvider", "Account not found: ".concat(str));
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final Cursor e(String[] strArr, String str, String str2, long j, boolean z, fecj fecjVar, String str3) {
        MatrixCursor matrixCursor;
        int i;
        List k;
        List k2;
        List k3;
        List k4;
        List k5;
        List k6;
        List k7;
        List k8;
        List k9;
        List k10;
        List k11;
        List k12;
        List k13;
        List k14;
        List l;
        List k15;
        List k16;
        List k17;
        List k18;
        String str4 = str;
        if (str4 == null) {
            cuey.c("PeopleGalProvider", "lookup key cannot be null.");
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekxd ekxdVar = (ekxd) fecjVar.b;
            ekxd ekxdVar2 = ekxd.a;
            ekxdVar.d = 6;
            ekxdVar.b |= 2;
            return new MatrixCursor(strArr);
        }
        Account d = d(str2, fecjVar);
        if (d == null) {
            return new MatrixCursor(strArr);
        }
        frfn frfnVar = frfn.a;
        if (frfnVar.a().l() && str4.startsWith("people-v2:")) {
            str4 = str4.substring(10);
        }
        etzl etzlVar = (etzl) etzm.a.v();
        fecj v = euap.a.v();
        fecj a = cuhk.a(str3);
        if (!v.b.L()) {
            v.U();
        }
        euap euapVar = (euap) v.b;
        etyn etynVar = (etyn) a.Q();
        etynVar.getClass();
        euapVar.c = etynVar;
        euapVar.b |= 1;
        if (!etzlVar.b.L()) {
            etzlVar.U();
        }
        etzm etzmVar = (etzm) etzlVar.b;
        euap euapVar2 = (euap) v.Q();
        euapVar2.getClass();
        etzmVar.f = euapVar2;
        etzmVar.b |= 8;
        euaz euazVar = euaz.b;
        euax euaxVar = (euax) euazVar.v();
        febz febzVar = (febz) feca.a.v();
        febzVar.k("person.name");
        febzVar.k("person.about");
        febzVar.k("person.nickname");
        febzVar.k("person.birthday");
        febzVar.k("person.gender");
        febzVar.k("person.occupation");
        febzVar.k("person.other_keyword");
        febzVar.k("person.email");
        febzVar.k("person.address");
        febzVar.k("person.im");
        febzVar.k("person.organization");
        febzVar.k("person.contact_group_membership");
        febzVar.k("person.interest");
        febzVar.k("person.user_defined");
        febzVar.k("person.language");
        febzVar.k("person.external_id");
        febzVar.k("person.phone");
        febzVar.k("person.website");
        febzVar.k("person.relation");
        febzVar.k("person.event");
        febzVar.k("person.sip_address");
        febzVar.k("person.client_data");
        febzVar.k("person.photo");
        if (frfnVar.a().y()) {
            febzVar.k("person.pronoun");
        }
        if (!euaxVar.b.L()) {
            euaxVar.U();
        }
        euaz euazVar2 = (euaz) euaxVar.b;
        feca fecaVar = (feca) febzVar.Q();
        fecaVar.getClass();
        euazVar2.d = fecaVar;
        euazVar2.c |= 1;
        euaxVar.a(euba.DOMAIN_PROFILE);
        euaxVar.a(euba.PROFILE);
        euaxVar.a(euba.DOMAIN_CONTACT);
        if (!etzlVar.b.L()) {
            etzlVar.U();
        }
        etzm etzmVar2 = (etzm) etzlVar.b;
        euaz euazVar3 = (euaz) euaxVar.Q();
        euazVar3.getClass();
        etzmVar2.d = euazVar3;
        etzmVar2.b |= 2;
        etzlVar.a(str4);
        if (frfnVar.a().j()) {
            euaz euazVar4 = ((etzm) etzlVar.b).d;
            if (euazVar4 != null) {
                euazVar = euazVar4;
            }
            fecj fecjVar2 = (fecj) euazVar.iB(5, null);
            fecjVar2.X(euazVar);
            euax euaxVar2 = (euax) fecjVar2;
            euaxVar2.a(euba.CONTACT);
            euaz euazVar5 = (euaz) euaxVar2.Q();
            if (!etzlVar.b.L()) {
                etzlVar.U();
            }
            etzm etzmVar3 = (etzm) etzlVar.b;
            euazVar5.getClass();
            etzmVar3.d = euazVar5;
            etzmVar3.b |= 2;
        }
        try {
            etzq b2 = this.a.b(b(d), (etzm) etzlVar.Q());
            if (b2.b.isEmpty() || (((euat) b2.b.get(0)).b & 2) == 0) {
                cuey.c("PeopleGalProvider", a.a(str2, "Can't find person: ", " for the given lookup key"));
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                ekxd ekxdVar3 = (ekxd) fecjVar.b;
                ekxd ekxdVar4 = ekxd.a;
                ekxdVar3.d = 7;
                ekxdVar3.b |= 2;
                return new MatrixCursor(strArr);
            }
            eggz eggzVar = ((euat) b2.b.get(0)).d;
            if (eggzVar == null) {
                eggzVar = eggz.a;
            }
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            ArrayList arrayList = new ArrayList();
            String str5 = eggzVar.c;
            ctpe ctpeVar = ctpe.a;
            if (!eggzVar.f.isEmpty() && (k18 = ctpeVar.k(eggzVar.f, str5)) != null && !k18.isEmpty()) {
                arrayList.add(cuhq.b(hashMap, (ContentValues) k18.get(0), j));
            }
            if (!eggzVar.m.isEmpty() && (k17 = ctpeVar.k(eggzVar.m, str5)) != null && !k17.isEmpty()) {
                arrayList.add(cuhq.b(hashMap, (ContentValues) k17.get(0), j));
            }
            if (!eggzVar.v.isEmpty() && (k16 = ctpeVar.k(eggzVar.v, str5)) != null && !k16.isEmpty()) {
                arrayList.add(cuhq.b(hashMap, (ContentValues) k16.get(0), j));
            }
            if (!eggzVar.l.isEmpty() && (k15 = ctpeVar.k(eggzVar.l, str5)) != null && !k15.isEmpty()) {
                arrayList.add(cuhq.b(hashMap, (ContentValues) k15.get(0), j));
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            cuye.e(eggzVar.j, eggzVar.v, eggzVar.w, eggzVar.F, arrayList2, arrayList3);
            int size = arrayList3.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(cuhq.b(hashMap, (ContentValues) arrayList3.get(i3), j));
            }
            if (!eggzVar.h.isEmpty() && (l = ctpe.l(eggzVar.h, str5)) != null && !l.isEmpty()) {
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it.next(), j));
                }
            }
            if (!eggzVar.n.isEmpty() && (k14 = ctpeVar.k(eggzVar.n, str5)) != null && !k14.isEmpty()) {
                Iterator it2 = k14.iterator();
                while (it2.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it2.next(), j));
                }
            }
            if (!eggzVar.s.isEmpty() && (k13 = ctpeVar.k(eggzVar.s, str5)) != null && !k13.isEmpty()) {
                Iterator it3 = k13.iterator();
                while (it3.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it3.next(), j));
                }
            }
            if (!eggzVar.x.isEmpty() && (k12 = ctpeVar.k(eggzVar.x, str5)) != null && !k12.isEmpty()) {
                Iterator it4 = k12.iterator();
                while (it4.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it4.next(), j));
                }
            }
            if (!eggzVar.p.isEmpty() && (k11 = ctpeVar.k(eggzVar.p, str5)) != null && !k11.isEmpty()) {
                Iterator it5 = k11.iterator();
                while (it5.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it5.next(), j));
                }
            }
            if (!eggzVar.t.isEmpty() && (k10 = ctpeVar.k(eggzVar.t, str5)) != null && !k10.isEmpty()) {
                Iterator it6 = k10.iterator();
                while (it6.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it6.next(), j));
                }
            }
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList.add(cuhq.b(hashMap, (ContentValues) arrayList2.get(i4), j));
            }
            if (!eggzVar.E.isEmpty() && (k9 = ctpeVar.k(eggzVar.E, str5)) != null && !k9.isEmpty()) {
                Iterator it7 = k9.iterator();
                while (it7.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it7.next(), j));
                }
            }
            if (!eggzVar.u.isEmpty() && (k8 = ctpeVar.k(eggzVar.u, str5)) != null && !k8.isEmpty()) {
                Iterator it8 = k8.iterator();
                while (it8.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it8.next(), j));
                }
            }
            if (!eggzVar.q.isEmpty() && (k7 = ctpeVar.k(eggzVar.q, str5)) != null && !k7.isEmpty()) {
                Iterator it9 = k7.iterator();
                while (it9.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it9.next(), j));
                }
            }
            if (!eggzVar.i.isEmpty() && (k6 = ctpeVar.k(eggzVar.i, str5)) != null && !k6.isEmpty()) {
                Iterator it10 = k6.iterator();
                while (it10.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it10.next(), j));
                }
            }
            if (!eggzVar.A.isEmpty() && (k5 = ctpeVar.k(eggzVar.A, str5)) != null && !k5.isEmpty()) {
                Iterator it11 = k5.iterator();
                while (it11.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it11.next(), j));
                }
            }
            if (!eggzVar.z.isEmpty() && (k4 = ctpeVar.k(eggzVar.z, str5)) != null && !k4.isEmpty()) {
                Iterator it12 = k4.iterator();
                while (it12.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it12.next(), j));
                }
            }
            if (!eggzVar.C.isEmpty() && (k3 = ctpeVar.k(eggzVar.C, str5)) != null && !k3.isEmpty()) {
                Iterator it13 = k3.iterator();
                while (it13.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it13.next(), j));
                }
            }
            if (!eggzVar.D.isEmpty() && (k2 = ctpeVar.k(eggzVar.D, str5)) != null && !k2.isEmpty()) {
                Iterator it14 = k2.iterator();
                while (it14.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it14.next(), j));
                }
            }
            if (!eggzVar.y.isEmpty() && (k = ctpeVar.k(eggzVar.y, str5)) != null && !k.isEmpty()) {
                Iterator it15 = k.iterator();
                while (it15.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it15.next(), j));
                }
            }
            List d2 = cuye.d((egfq[]) eggzVar.o.toArray(new egfq[0]));
            if (d2 != null && !d2.isEmpty()) {
                Iterator it16 = d2.iterator();
                while (it16.hasNext()) {
                    arrayList.add(cuhq.b(hashMap, (ContentValues) it16.next(), j));
                }
            }
            if (arrayList.isEmpty()) {
                matrixCursor = null;
            } else {
                Object[] objArr = (Object[]) arrayList.get(0);
                cuhq.a(objArr, hashMap, "contact_id", Long.valueOf(j));
                Pair a2 = cuhj.a(eggzVar);
                if (a2 != null) {
                    String b3 = cuhj.b(eggzVar, (String) a2.first);
                    cuhq.a(objArr, hashMap, "display_name", a2.first);
                    cuhq.a(objArr, hashMap, "display_name_source", a2.second);
                    cuhq.a(objArr, hashMap, "display_name_alt", b3);
                }
                cuhq.a(objArr, hashMap, "account_type", "com.google");
                cuhq.a(objArr, hashMap, "account_name", str2);
                cuhq.a(objArr, hashMap, "raw_contact_is_read_only", 1);
                cuhq.a(objArr, hashMap, "is_read_only", 1);
                if (c(eggzVar)) {
                    i = 0;
                    Uri a3 = a(str2, false, eggzVar.c, z);
                    cuhq.a(objArr, hashMap, "photo_uri", a3 == null ? null : a3.toString());
                    Uri a4 = a(str2, true, eggzVar.c, z);
                    cuhq.a(objArr, hashMap, "photo_thumb_uri", a4 == null ? null : a4.toString());
                } else {
                    i = 0;
                }
                matrixCursor = new MatrixCursor(strArr, arrayList.size());
                while (i < arrayList.size()) {
                    int i5 = i + 1;
                    Object[] objArr2 = (Object[]) arrayList.get(i);
                    if (objArr2 != null) {
                        cuhq.a(objArr2, hashMap, "data_id", Integer.valueOf(i5));
                        matrixCursor.addRow(objArr2);
                    }
                    i = i5;
                }
            }
            if (matrixCursor != null) {
                int count = matrixCursor.getCount();
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                ekxd ekxdVar5 = (ekxd) fecjVar.b;
                ekxd ekxdVar6 = ekxd.a;
                ekxdVar5.b |= 32;
                ekxdVar5.g = count;
            }
            return matrixCursor;
        } catch (ftye e) {
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekxd ekxdVar7 = (ekxd) fecjVar.b;
            ekxd ekxdVar8 = ekxd.a;
            ekxdVar7.d = 14;
            ekxdVar7.b |= 2;
            int i6 = e.a.t.r;
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekxd ekxdVar9 = (ekxd) fecjVar.b;
            ekxdVar9.b |= 16;
            ekxdVar9.f = i6;
            f(fecjVar, e);
            cuey.c("PeopleGalProvider", "Error getPeople grpc response: ".concat(e.toString()));
            return new MatrixCursor(strArr);
        } catch (unx e2) {
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekxd ekxdVar10 = (ekxd) fecjVar.b;
            ekxd ekxdVar11 = ekxd.a;
            ekxdVar10.d = 3;
            ekxdVar10.b |= 2;
            f(fecjVar, e2);
            cuey.c("PeopleGalProvider", "Error getPeople grpc response: ".concat(e2.toString()));
            return new MatrixCursor(strArr);
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        if (b.match(uri) == 1) {
            return "vnd.android.cursor.item/contact";
        }
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        Context context = this.e;
        if (context == null) {
            context = getContext();
        }
        this.e = context;
        this.d = bqna.b(context);
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final ParcelFileDescriptor openFile(final Uri uri, String str) {
        String.valueOf(uri);
        final fecj v = ekxd.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ekxd ekxdVar = (ekxd) v.b;
        ekxdVar.c = 8;
        ekxdVar.b |= 1;
        String str2 = null;
        r4 = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            final Account d = d(uri.getQueryParameter("account_name"), v);
            if (d == null) {
                cuey.f("PeopleGalProvider", "OpenFile method completed.");
                fecp fecpVar = v.b;
                int a = ellz.a(((ekxd) fecpVar).d);
                if (a == 0 || a == 1) {
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    ekxd ekxdVar2 = (ekxd) v.b;
                    ekxdVar2.d = 1;
                    ekxdVar2.b |= 2;
                    cuey.f("PeopleGalProvider", "OpenFile method finished successfully");
                }
                ctkm.a().h((ekxd) v.Q(), null);
                return null;
            }
            String str3 = d.name;
            try {
                if (!"r".equals(str)) {
                    if (!v.b.L()) {
                        v.U();
                    }
                    ekxd ekxdVar3 = (ekxd) v.b;
                    ekxdVar3.d = 10;
                    ekxdVar3.b |= 2;
                    cuey.c("PeopleGalProvider", "mode must be \"r\"");
                } else if (cuty.a(this.e).b()) {
                    parcelFileDescriptor = (ParcelFileDescriptor) cuhi.a(this.c, new Callable() { // from class: cuhl
                        /* JADX WARN: Removed duplicated region for block: B:46:0x01e3  */
                        /* JADX WARN: Removed duplicated region for block: B:48:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // java.util.concurrent.Callable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object call() {
                            /*
                                Method dump skipped, instructions count: 548
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.cuhl.call():java.lang.Object");
                        }
                    }, "GalOpenFileThread", frfn.e());
                } else {
                    if (!v.b.L()) {
                        v.U();
                    }
                    ekxd ekxdVar4 = (ekxd) v.b;
                    ekxdVar4.d = 2;
                    ekxdVar4.b |= 2;
                    cuey.c("PeopleGalProvider", "Don't have Contacts permission.");
                }
                cuey.f("PeopleGalProvider", "OpenFile method completed.");
                fecp fecpVar2 = v.b;
                int a2 = ellz.a(((ekxd) fecpVar2).d);
                if (a2 == 0 || a2 == 1) {
                    if (!fecpVar2.L()) {
                        v.U();
                    }
                    ekxd ekxdVar5 = (ekxd) v.b;
                    ekxdVar5.d = 1;
                    ekxdVar5.b |= 2;
                    cuey.f("PeopleGalProvider", "OpenFile method finished successfully");
                }
                ctkm.a().h((ekxd) v.Q(), str3);
                return parcelFileDescriptor;
            } catch (Throwable th) {
                th = th;
                str2 = str3;
                cuey.f("PeopleGalProvider", "OpenFile method completed.");
                fecp fecpVar3 = v.b;
                int a3 = ellz.a(((ekxd) fecpVar3).d);
                if (a3 == 0 || a3 == 1) {
                    if (!fecpVar3.L()) {
                        v.U();
                    }
                    ekxd ekxdVar6 = (ekxd) v.b;
                    ekxdVar6.d = 1;
                    ekxdVar6.b |= 2;
                    cuey.f("PeopleGalProvider", "OpenFile method finished successfully");
                }
                ctkm.a().h((ekxd) v.Q(), str2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x095d, code lost:
    
        if (r4 == 1) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04fa, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        r8.U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        defpackage.ekxd.b((defpackage.ekxd) r8.b, r4);
        r0 = defpackage.ctkm.a();
        r2 = r8.Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x07b5, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x01b3, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0244, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0925, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5 A[Catch: all -> 0x0929, Exception -> 0x092c, TryCatch #23 {Exception -> 0x092c, all -> 0x0929, blocks: (B:3:0x0020, B:5:0x0029, B:7:0x0031, B:9:0x0039, B:10:0x003c, B:32:0x00bc, B:34:0x00c6, B:36:0x00ce, B:37:0x00d1, B:57:0x01bd, B:59:0x01c5, B:60:0x01c8, B:62:0x01d7, B:64:0x01df, B:65:0x01e2, B:81:0x0248, B:183:0x0479, B:185:0x048f, B:186:0x0492, B:203:0x04fe, B:230:0x0589, B:436:0x013c, B:438:0x0146, B:440:0x014e, B:441:0x0151), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d7 A[Catch: all -> 0x0929, Exception -> 0x092c, TryCatch #23 {Exception -> 0x092c, all -> 0x0929, blocks: (B:3:0x0020, B:5:0x0029, B:7:0x0031, B:9:0x0039, B:10:0x003c, B:32:0x00bc, B:34:0x00c6, B:36:0x00ce, B:37:0x00d1, B:57:0x01bd, B:59:0x01c5, B:60:0x01c8, B:62:0x01d7, B:64:0x01df, B:65:0x01e2, B:81:0x0248, B:183:0x0479, B:185:0x048f, B:186:0x0492, B:203:0x04fe, B:230:0x0589, B:436:0x013c, B:438:0x0146, B:440:0x014e, B:441:0x0151), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0248 A[Catch: all -> 0x0929, Exception -> 0x092c, TRY_ENTER, TRY_LEAVE, TryCatch #23 {Exception -> 0x092c, all -> 0x0929, blocks: (B:3:0x0020, B:5:0x0029, B:7:0x0031, B:9:0x0039, B:10:0x003c, B:32:0x00bc, B:34:0x00c6, B:36:0x00ce, B:37:0x00d1, B:57:0x01bd, B:59:0x01c5, B:60:0x01c8, B:62:0x01d7, B:64:0x01df, B:65:0x01e2, B:81:0x0248, B:183:0x0479, B:185:0x048f, B:186:0x0492, B:203:0x04fe, B:230:0x0589, B:436:0x013c, B:438:0x0146, B:440:0x014e, B:441:0x0151), top: B:2:0x0020 }] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider] */
    /* JADX WARN: Type inference failed for: r2v116, types: [ctkm] */
    /* JADX WARN: Type inference failed for: r2v137, types: [ctkm] */
    /* JADX WARN: Type inference failed for: r4v17, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.String] */
    @Override // com.google.android.chimera.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.Cursor query(android.net.Uri r21, final java.lang.String[] r22, java.lang.String r23, java.lang.String[] r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 2494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public PeopleGalChimeraProvider(Context context, cugw cugwVar) {
        this.e = context;
        this.a = cugwVar;
    }
}
