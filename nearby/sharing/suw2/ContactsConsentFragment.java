package com.google.android.gms.nearby.sharing.suw2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.DeviceVisibility;
import com.google.android.gms.nearby.sharing.suw2.ContactsConsentFragment;
import com.google.android.setupdesign.GlifLayout;
import defpackage.aby;
import defpackage.aca;
import defpackage.colj;
import defpackage.conl;
import defpackage.conm;
import defpackage.cttm;
import defpackage.cttn;
import defpackage.ctto;
import defpackage.cttp;
import defpackage.cttq;
import defpackage.cttr;
import defpackage.ctuc;
import defpackage.ctuf;
import defpackage.ctuj;
import defpackage.dvtn;
import defpackage.efrl;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.efsn;
import defpackage.eftg;
import defpackage.efva;
import defpackage.efvo;
import defpackage.efvr;
import defpackage.efvv;
import defpackage.efwn;
import defpackage.fauu;
import defpackage.ftgi;
import defpackage.fxqu;
import defpackage.fxqv;
import defpackage.fxqw;
import defpackage.fxqz;
import defpackage.fxsr;
import defpackage.fxtb;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.fycr;
import defpackage.jvd;
import defpackage.jxm;
import defpackage.nwa;
import defpackage.oae;
import defpackage.oep;
import defpackage.ryt;
import defpackage.ryu;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ContactsConsentFragment extends ctuf {
    public static final /* synthetic */ int b = 0;
    private static final Map c = fxtb.f(new fxqz(".grey600", Integer.valueOf(R.color.lottie_dark_grey600)), new fxqz(".grey700", Integer.valueOf(R.color.lottie_dark_grey700)), new fxqz(".grey800", Integer.valueOf(R.color.lottie_dark_grey800)), new fxqz(".black", Integer.valueOf(R.color.lottie_dark_black)), new fxqz(".white", Integer.valueOf(R.color.lottie_dark_white)));
    public aca a;
    private final fxqu d;

    public ContactsConsentFragment() {
        fxqu a = fxqv.a(fxqw.c, new ctto(new cttn(this)));
        int i = fxya.a;
        this.d = new jxm(new fxxg(ctuc.class), new cttp(a), new cttr(this, a), new cttq(a));
    }

    public final void A() {
        ryt a = ryu.a(this);
        if (!eftg.b(a.getIntent())) {
            conm.a.c().p("No setup wizard manager found.", new Object[0]);
            a.setResult(-1);
            a.finish();
            return;
        }
        if (fxxm.n(a.getIntent().getAction(), "com.google.android.gms.nearby.sharing.SETUP_WRAPPED")) {
            conm.a.b().h("Setup activity is wrapped, finishing with result code: %d", -1);
            a.setResult(-1);
            a.finish();
            return;
        }
        Intent intent = a.getIntent();
        Intent intent2 = new Intent("com.android.wizard.NEXT");
        eftg.a(intent, intent2);
        intent2.putExtra("com.android.setupwizard.ResultCode", -1);
        intent2.putExtra("theme", intent.getStringExtra("theme"));
        if (Build.VERSION.SDK_INT >= 24) {
            List<ResolveInfo> queryIntentActivities = requireContext().getPackageManager().queryIntentActivities(intent2, 1048576);
            fxxm.e(queryIntentActivities, "queryIntentActivities(...)");
            if (fxsr.N(queryIntentActivities) == null) {
                throw new IllegalStateException("No wizard manager in system image found.");
            }
        }
        conm.a.b().p("Setup activity is not wrapped, launching next activity.", new Object[0]);
        aca acaVar = this.a;
        if (acaVar == null) {
            fxxm.j("setupWizardLauncher");
            acaVar = null;
        }
        acaVar.b(intent2);
    }

    @Override // defpackage.dg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().b(new conl(this, fauu.USE_CASE_SETUP_WIZARD, colj.f(getContext())));
        this.a = registerForActivityResult(new dvtn(), new aby() { // from class: cttg
            @Override // defpackage.aby
            public final void jF(Object obj) {
                int i = ContactsConsentFragment.b;
                fxxm.f((oko) obj, "it");
            }
        });
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fxxm.f(layoutInflater, "inflater");
        Context requireContext = requireContext();
        int i = efwn.a;
        return layoutInflater.inflate(true != efrl.s(requireContext) ? R.layout.sharing_suw2_consent_fragment_v2 : R.layout.sharing_suw2_consent_fragment_v2_bc25, viewGroup, false);
    }

    @Override // defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        fxxm.f(view, "view");
        TextView textView = (TextView) view.findViewById(R.id.how_it_works);
        fxxm.c(textView);
        ctuj.a(textView, 20.0f);
        TextView textView2 = (TextView) view.findViewById(R.id.contacts_upload_title);
        fxxm.c(textView2);
        ctuj.a(textView2, 24.0f);
        TextView textView3 = (TextView) view.findViewById(R.id.contacts_upload_description);
        fxxm.c(textView3);
        ctuj.a(textView3, 20.0f);
        if (ftgi.a.lK().M()) {
            GlifLayout glifLayout = (GlifLayout) view.findViewById(R.id.glif_layout);
            fxxm.c(glifLayout);
            fxxm.f(glifLayout, "<this>");
            efva efvaVar = (efva) glifLayout.q(efva.class);
            if (efvaVar != null) {
                efvaVar.a().setMaxLines(10);
            }
        }
        Context requireContext = requireContext();
        int i = efwn.a;
        if (!efrl.s(requireContext)) {
            final LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.animation);
            fxxm.c(lottieAnimationView);
            for (Map.Entry entry : c.entrySet()) {
                String str = (String) entry.getKey();
                final int color = lottieAnimationView.getContext().getColor(((Number) entry.getValue()).intValue());
                lottieAnimationView.c(new oae("**", str, "**"), nwa.K, new oep() { // from class: cttc
                    @Override // defpackage.oep
                    public final Object a() {
                        int i2 = ContactsConsentFragment.b;
                        return new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                    }
                });
            }
            lottieAnimationView.setOnClickListener(new View.OnClickListener() { // from class: cttf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i2 = ContactsConsentFragment.b;
                    LottieAnimationView lottieAnimationView2 = LottieAnimationView.this;
                    if (lottieAnimationView2.t()) {
                        lottieAnimationView2.f();
                    } else {
                        lottieAnimationView2.i();
                    }
                }
            });
        }
        ((Button) view.findViewById(R.id.learn_more_link)).setOnClickListener(new View.OnClickListener() { // from class: cttb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                new cttj().show(ContactsConsentFragment.this.getParentFragmentManager(), "LearnMoreDialog");
            }
        });
        GlifLayout glifLayout2 = (GlifLayout) view.findViewById(R.id.glif_layout);
        fxxm.c(glifLayout2);
        fxxm.f(glifLayout2, "<this>");
        efsl efslVar = (efsl) glifLayout2.q(efsl.class);
        if (efslVar != null) {
            efsm efsmVar = new efsm(requireContext());
            efsmVar.b(R.string.common_no_thanks);
            efsmVar.b = new View.OnClickListener() { // from class: cttd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ContactsConsentFragment contactsConsentFragment = ContactsConsentFragment.this;
                    final ctuc x = contactsConsentFragment.x();
                    cojh cojhVar = x.a;
                    x.a("SharingClient#reset()", cojhVar.v());
                    x.a("SharingClient#optIn()", cojhVar.q());
                    x.a("SharingClient#setVisibility(SELF_SHARE)", cojhVar.C(4));
                    x.a("SharingClient#setEnabled(true)", cojhVar.K());
                    if (ftgi.z()) {
                        fycr.b(jxl.a(x), fygk.a, null, new ctub(x, null), 2);
                    }
                    if (ftgf.i()) {
                        dhlw i2 = cojhVar.i();
                        final fxwo fxwoVar = new fxwo() { // from class: cttt
                            @Override // defpackage.fxwo
                            public final Object a(Object obj) {
                                DeviceVisibility deviceVisibility = (DeviceVisibility) obj;
                                ctuc.this.b.i(colp.t(deviceVisibility.f, deviceVisibility.g));
                                return fxrq.a;
                            }
                        };
                        i2.z(new dhlq() { // from class: cttu
                            @Override // defpackage.dhlq
                            public final void gC(Object obj) {
                                fxwo.this.a(obj);
                            }
                        });
                        i2.y(new dhln() { // from class: cttv
                            @Override // defpackage.dhln
                            public final void gB(Exception exc) {
                                ctuc.this.b.i(colp.t(4, -1));
                            }
                        });
                    } else {
                        x.b.i(colp.t(4, -1));
                    }
                    contactsConsentFragment.A();
                }
            };
            efsmVar.c = 7;
            efsmVar.d = R.style.SudGlifButton_Secondary;
            efslVar.c(efsmVar.a());
            efsm efsmVar2 = new efsm(requireContext());
            efsmVar2.b(R.string.sharing_suw2_agree);
            efsmVar2.c = 5;
            efsmVar2.d = R.style.SudGlifButton_Primary;
            efslVar.b(efsmVar2.a());
            fxxm.f(glifLayout2, "<this>");
            efvv efvvVar = (efvv) glifLayout2.q(efvv.class);
            if (efvvVar != null) {
                Context requireContext2 = requireContext();
                efsn efsnVar = efslVar.i;
                efsn efsnVar2 = efslVar.j;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ctte
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ContactsConsentFragment contactsConsentFragment = ContactsConsentFragment.this;
                        final ctuc x = contactsConsentFragment.x();
                        cojh cojhVar = x.a;
                        x.a("SharingClient#optIn()", cojhVar.q());
                        x.a("SharingClient#consentToContactsUpload()", cojhVar.c());
                        x.a("SharingClient#setVisibility(ALL_CONTACTS)", cojhVar.C(1));
                        x.a("SharingClient#setEnabled(true)", cojhVar.K());
                        if (ftgi.z()) {
                            fycr.b(jxl.a(x), fygk.a, null, new ctua(x, null), 2);
                        }
                        if (ftgf.i()) {
                            dhlw i2 = cojhVar.i();
                            final fxwo fxwoVar = new fxwo() { // from class: cttw
                                @Override // defpackage.fxwo
                                public final Object a(Object obj) {
                                    DeviceVisibility deviceVisibility = (DeviceVisibility) obj;
                                    ctuc.this.b.i(colp.t(deviceVisibility.f, deviceVisibility.g));
                                    return fxrq.a;
                                }
                            };
                            i2.z(new dhlq() { // from class: cttx
                                @Override // defpackage.dhlq
                                public final void gC(Object obj) {
                                    fxwo.this.a(obj);
                                }
                            });
                            i2.y(new dhln() { // from class: ctty
                                @Override // defpackage.dhln
                                public final void gB(Exception exc) {
                                    ctuc.this.b.i(colp.t(1, -1));
                                }
                            });
                        } else {
                            x.b.i(colp.t(1, -1));
                        }
                        contactsConsentFragment.A();
                    }
                };
                CharSequence text = requireContext2.getText(R.string.common_more);
                Context context = efvvVar.c.getContext();
                if (efrl.s(context)) {
                    efvvVar.c(context, onClickListener);
                } else {
                    CharSequence charSequence = efsnVar.b;
                    efsnVar.f = new efvo(efvvVar, onClickListener);
                    efvvVar.d = new efvr(efsnVar, text, charSequence, efsnVar2);
                    efvvVar.b();
                }
            }
        }
        fycr.b(jvd.a(this), null, null, new cttm(this, view, null), 3);
    }

    public final ctuc x() {
        return (ctuc) this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(android.view.View r7, defpackage.fxun r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cttk
            if (r0 == 0) goto L13
            r0 = r8
            cttk r0 = (defpackage.cttk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cttk r0 = new cttk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fxuz r1 = defpackage.fxuz.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.fxrc.b(r8)
            goto L93
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fxrc.b(r8)
            android.content.Context r8 = r6.requireContext()
            bsup r8 = defpackage.bsup.b(r8)
            java.lang.String r2 = "com.google"
            android.accounts.Account[] r8 = r8.p(r2)
            defpackage.fxxm.c(r8)
            java.lang.String r2 = "<this>"
            defpackage.fxxm.f(r8, r2)
            int r2 = r8.length
            if (r2 != 0) goto L4f
            r8 = 0
            goto L52
        L4f:
            r2 = 0
            r8 = r8[r2]
        L52:
            if (r8 == 0) goto La6
            ctuc r2 = r6.x()
            cojh r4 = r2.a
            dhlw r4 = r4.x(r8)
            java.lang.String r5 = "SharingClient#setAccount(account)"
            r2.a(r5, r4)
            android.content.Context r2 = r6.getContext()
            colj r2 = defpackage.colj.f(r2)
            android.content.Context r4 = r6.getContext()
            r2.h(r4, r8)
            r2 = 2131430288(0x7f0b0b90, float:1.8482273E38)
            android.view.View r7 = r7.findViewById(r2)
            com.google.android.setupdesign.GlifLayout r7 = (com.google.android.setupdesign.GlifLayout) r7
            if (r7 != 0) goto L7e
            goto La2
        L7e:
            efvh r2 = defpackage.ctue.a(r7)
            if (r2 == 0) goto L89
            java.lang.String r4 = r8.name
            r2.g(r4)
        L89:
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.z(r8, r0)
            if (r8 == r1) goto La5
        L93:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            if (r8 == 0) goto La2
            com.google.android.setupdesign.GlifLayout r7 = (com.google.android.setupdesign.GlifLayout) r7
            efvh r7 = defpackage.ctue.a(r7)
            if (r7 == 0) goto La2
            r7.e(r8)
        La2:
            fxrq r7 = defpackage.fxrq.a
            return r7
        La5:
            return r1
        La6:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "device must have at least one Google account"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.suw2.ContactsConsentFragment.y(android.view.View, fxun):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(android.accounts.Account r5, defpackage.fxun r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cttl
            if (r0 == 0) goto L13
            r0 = r6
            cttl r0 = (defpackage.cttl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cttl r0 = new cttl
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fxuz r1 = defpackage.fxuz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.fxrc.b(r6)
            fxrb r6 = (defpackage.fxrb) r6
            java.lang.Object r5 = r6.a
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fxrc.b(r6)
            android.content.Context r6 = r4.getContext()
            dhlw r5 = defpackage.ctuq.c(r6, r5)
            r0.c = r3
            java.lang.Object r5 = defpackage.cooa.c(r5, r0)
            if (r5 == r1) goto L5c
        L46:
            boolean r6 = r5 instanceof defpackage.fxra
            r0 = 0
            if (r3 != r6) goto L4c
            r5 = r0
        L4c:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 != 0) goto L51
            return r0
        L51:
            android.content.Context r6 = r4.getContext()
            r0 = 1103101952(0x41c00000, float:24.0)
            android.graphics.drawable.Drawable r5 = defpackage.ctwt.g(r6, r5, r0)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.suw2.ContactsConsentFragment.z(android.accounts.Account, fxun):java.lang.Object");
    }
}
