package com.google.android.gms.people.consentprimitive;

import android.R;
import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.people.consentprimitive.ContactsConsentData;
import com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveChimeraActivity;
import com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData;
import com.google.android.gms.people.consentprimitive.ContactsConsentsResults;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionRequest;
import defpackage.arxd;
import defpackage.asnd;
import defpackage.ctpt;
import defpackage.ctrc;
import defpackage.ctsu;
import defpackage.ctsw;
import defpackage.ctsx;
import defpackage.ctsy;
import defpackage.ctsz;
import defpackage.cttf;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eiuu;
import defpackage.elkn;
import defpackage.elkp;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensv;
import defpackage.fqzf;
import defpackage.jpd;
import defpackage.jpz;
import defpackage.jrh;
import defpackage.qfp;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactsConsentPrimitiveChimeraActivity extends qfp {
    public ctsy j;

    public final void a() {
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        findViewById(com.google.android.gms.R.id.root).setBackgroundColor(getColor(typedValue.resourceId));
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        enss i;
        eiid j;
        GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest;
        super.onCreate(bundle);
        if (!fqzf.d()) {
            finish();
            return;
        }
        setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityNoUiTheme);
        setContentView(com.google.android.gms.R.layout.consent_primitive_activity);
        GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest2 = new GetBackupSyncSuggestionRequest(8, 3);
        Intent intent = getIntent();
        if (intent != null && (getBackupSyncSuggestionRequest = (GetBackupSyncSuggestionRequest) arxd.b(intent, "sheepdogRequest", GetBackupSyncSuggestionRequest.CREATOR)) != null) {
            getBackupSyncSuggestionRequest2 = getBackupSyncSuggestionRequest;
        }
        ctsy ctsyVar = (ctsy) new jrh(this, new ctsz(this, this, getBackupSyncSuggestionRequest2)).a(ctsy.class);
        this.j = ctsyVar;
        int a = elkp.a(getIntent().getIntExtra("referrer", 0));
        ctsyVar.i = a;
        if (a == 0) {
            ctsyVar.i = 1;
        }
        ctsy ctsyVar2 = this.j;
        ContactsConsentsStatus contactsConsentsStatus = (ContactsConsentsStatus) arxd.b(getIntent(), "status", new cttf());
        jpz jpzVar = ctsyVar2.b;
        if (!jpzVar.a.a.containsKey("ui-data")) {
            if (contactsConsentsStatus != null) {
                ContactsConsentsConfig contactsConsentsConfig = contactsConsentsStatus.c;
                Account account = contactsConsentsConfig.d;
                if (account == null) {
                    j = eigb.a;
                } else {
                    List<Account> list = contactsConsentsConfig.h;
                    ctpt i2 = ContactsConsentData.i();
                    i2.d(list);
                    ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = contactsConsentsStatus.a;
                    i2.e(contactsConsentsCoarseStatus.a);
                    i2.f(contactsConsentsCoarseStatus.b);
                    i2.c(contactsConsentsCoarseStatus.c);
                    eiuu G = eiuu.G(contactsConsentsCoarseStatus.a());
                    if (i2.c != null) {
                        throw new IllegalStateException("Cannot set dcEligibleAndDisabledAccounts after calling dcEligibleAndDisabledAccountsBuilder()");
                    }
                    i2.d = eiuu.G(G);
                    i2.g(0);
                    ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = contactsConsentsStatus.b;
                    if (contactsConsentsDetailedStatus != null) {
                        i2.g(contactsConsentsDetailedStatus.a);
                        for (Account account2 : list) {
                            i2.b(account2, contactsConsentsDetailedStatus.b.getInt(account2.name, 0));
                        }
                    }
                    ContactsConsentData a2 = i2.a();
                    ctsw o = ContactsConsentPrimitiveViewModel$ConsentUiData.o();
                    o.a = account;
                    o.b(contactsConsentsConfig.i ? 1 : 0);
                    o.c(contactsConsentsConfig);
                    o.d(a2);
                    o.e(elkn.CHOICES_PAGE);
                    o.f(true != a2.k(account) ? 0 : 3);
                    o.l(true != ((C$AutoValue_ContactsConsentData) a2).c ? 0 : 3);
                    o.i(ContactsConsentPrimitiveViewModel$ConsentUiData.p(a2, contactsConsentsConfig, account));
                    j = eiid.j(o.a());
                }
                if (j.h()) {
                    jpzVar.a("ui-data").l(j.c());
                } else {
                    ctsyVar2.f.hS(new ctsx(2, null));
                }
                i = ensj.i(contactsConsentsStatus.a.b());
            } else {
                Context context = ctsyVar2.g;
                i = ensj.i(asnd.h(context, context.getPackageName()));
            }
            ensi h = ensi.h(i);
            final ctrc ctrcVar = ctsyVar2.h;
            Objects.requireNonNull(ctrcVar);
            enqc enqcVar = new enqc() { // from class: ctsb
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    return ctrc.this.a((List) obj);
                }
            };
            ensv ensvVar = ctsyVar2.d;
            ensj.t(enps.g(h, enqcVar, ensvVar), new ctsu(ctsyVar2, contactsConsentsStatus), ensvVar);
        }
        this.j.a().g(this, new jpd() { // from class: ctpy
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ContactsConsentPrimitiveViewModel$ConsentUiData contactsConsentPrimitiveViewModel$ConsentUiData = (ContactsConsentPrimitiveViewModel$ConsentUiData) obj;
                int ordinal = contactsConsentPrimitiveViewModel$ConsentUiData.k().ordinal();
                final ContactsConsentPrimitiveChimeraActivity contactsConsentPrimitiveChimeraActivity = ContactsConsentPrimitiveChimeraActivity.this;
                switch (ordinal) {
                    case 1:
                        dg g = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().g(com.google.android.gms.R.id.root);
                        if (g != null) {
                            bp bpVar = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar.n(g);
                            bpVar.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityNoUiTheme);
                        contactsConsentPrimitiveChimeraActivity.findViewById(com.google.android.gms.R.id.root).setBackgroundResource(R.color.transparent);
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar2 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar2.v(new ctqd(), "choices-tag");
                            bpVar2.e();
                            break;
                        }
                        break;
                    case 2:
                        dg h2 = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag");
                        if (h2 != null) {
                            bp bpVar3 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar3.n(h2);
                            bpVar3.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityFullPageTheme);
                        contactsConsentPrimitiveChimeraActivity.a();
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("rec-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar4 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar4.z(com.google.android.gms.R.id.root, new ctro(), "rec-tag");
                            bpVar4.e();
                            break;
                        }
                        break;
                    case 3:
                        dg h3 = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag");
                        if (h3 != null) {
                            bp bpVar5 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar5.n(h3);
                            bpVar5.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityFullPageTheme);
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("dc-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar6 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar6.z(com.google.android.gms.R.id.root, new ctrg(), "dc-tag");
                            bpVar6.e();
                            contactsConsentPrimitiveChimeraActivity.a();
                            break;
                        }
                        break;
                    case 4:
                        dg h4 = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag");
                        if (h4 != null) {
                            bp bpVar7 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar7.n(h4);
                            bpVar7.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityFullPageTheme);
                        contactsConsentPrimitiveChimeraActivity.a();
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("sheep-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar8 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar8.z(com.google.android.gms.R.id.root, new ctrs(), "sheep-tag");
                            bpVar8.e();
                            break;
                        }
                        break;
                    case 5:
                        dg h5 = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag");
                        if (h5 != null) {
                            bp bpVar9 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar9.n(h5);
                            bpVar9.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityFullPageTheme);
                        contactsConsentPrimitiveChimeraActivity.a();
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("sim-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar10 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar10.z(com.google.android.gms.R.id.root, new ctrw(), "sim-tag");
                            bpVar10.e();
                            break;
                        }
                        break;
                    case 6:
                        dg h6 = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag");
                        if (h6 != null) {
                            bp bpVar11 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar11.n(h6);
                            bpVar11.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityFullPageTheme);
                        contactsConsentPrimitiveChimeraActivity.a();
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("finish-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar12 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar12.z(com.google.android.gms.R.id.root, new ctqg(), "finish-tag");
                            bpVar12.e();
                            break;
                        }
                        break;
                    case 8:
                        ContactsConsentData g2 = contactsConsentPrimitiveViewModel$ConsentUiData.g();
                        contactsConsentPrimitiveChimeraActivity.j.g();
                        View inflate = contactsConsentPrimitiveChimeraActivity.getLayoutInflater().inflate(com.google.android.gms.R.layout.consent_primitive_confirm_dismiss, (ViewGroup) null, false);
                        inflate.findViewById(com.google.android.gms.R.id.dc_off).setVisibility(true != g2.d().contains(contactsConsentPrimitiveViewModel$ConsentUiData.f()) ? 8 : 0);
                        TextView textView = (TextView) inflate.findViewById(com.google.android.gms.R.id.sheepdog_off);
                        textView.setVisibility(true != g2.g() ? 8 : 0);
                        int a3 = g2.a();
                        if (a3 == 0) {
                            textView.setText(com.google.android.gms.R.string.confirm_custom_page_sheepdog_zero_contacts);
                        } else {
                            textView.setText(contactsConsentPrimitiveChimeraActivity.getResources().getQuantityString(com.google.android.gms.R.plurals.sheepdog_leave_off_warning, a3, Integer.valueOf(a3)));
                        }
                        TextView textView2 = (TextView) inflate.findViewById(com.google.android.gms.R.id.sim_off);
                        textView2.setVisibility(true == g2.l(contactsConsentPrimitiveViewModel$ConsentUiData.f()) ? 0 : 8);
                        int c = contactsConsentPrimitiveViewModel$ConsentUiData.c();
                        textView2.setText(contactsConsentPrimitiveChimeraActivity.getResources().getQuantityString(com.google.android.gms.R.plurals.sim_leave_off_warning, c, Integer.valueOf(c)));
                        ip ipVar = new ip(contactsConsentPrimitiveChimeraActivity);
                        ipVar.j(com.google.android.gms.R.string.confirm_dismiss_title);
                        ipVar.c(false);
                        ipVar.setPositiveButton(com.google.android.gms.R.string.confirm_dismiss_accept, new DialogInterface.OnClickListener() { // from class: ctpw
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                final ctsy ctsyVar3 = ContactsConsentPrimitiveChimeraActivity.this.j;
                                ctsyVar3.i(10, new asoq() { // from class: ctso
                                    @Override // defpackage.asoq
                                    public final Object a(Object obj2) {
                                        ctsy.this.f.l(new ctsx(4, null));
                                        return ((ContactsConsentPrimitiveViewModel$ConsentUiData) obj2).h();
                                    }
                                });
                            }
                        });
                        ipVar.setNegativeButton(com.google.android.gms.R.string.confirm_dismiss_change_settings, new DialogInterface.OnClickListener() { // from class: ctpx
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ContactsConsentPrimitiveChimeraActivity.this.j.i(18, new asoq() { // from class: ctsa
                                    @Override // defpackage.asoq
                                    public final Object a(Object obj2) {
                                        asot asotVar = ctsy.a;
                                        ctsw h7 = ((ContactsConsentPrimitiveViewModel$ConsentUiData) obj2).h();
                                        h7.e(elkn.CHOICES_PAGE);
                                        return h7;
                                    }
                                });
                            }
                        });
                        ipVar.setView(inflate);
                        ipVar.create().show();
                        break;
                    case 9:
                        contactsConsentPrimitiveChimeraActivity.j.g();
                        View inflate2 = contactsConsentPrimitiveChimeraActivity.getLayoutInflater().inflate(com.google.android.gms.R.layout.consent_primitive_learn_more, (ViewGroup) null, false);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.header_1)).setText(com.google.android.gms.R.string.dc_learn_more_header_1);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.header_2)).setText(com.google.android.gms.R.string.dc_learn_more_header_2);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.header_3)).setText(com.google.android.gms.R.string.learn_more_manage_data_header);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.body_1)).setText(com.google.android.gms.R.string.dc_learn_more_body_1);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.body_2)).setText(com.google.android.gms.R.string.dc_learn_more_body_2);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.body_3)).setText(com.google.android.gms.R.string.dc_learn_more_body_3);
                        ip ipVar2 = new ip(contactsConsentPrimitiveChimeraActivity);
                        ipVar2.j(com.google.android.gms.R.string.dc_turn_on_header);
                        ipVar2.setPositiveButton(com.google.android.gms.R.string.common_got_it, new DialogInterface.OnClickListener() { // from class: ctpu
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ContactsConsentPrimitiveChimeraActivity.this.j.e();
                            }
                        });
                        ipVar2.setView(inflate2);
                        ipVar2.create().show();
                        break;
                    case 10:
                        contactsConsentPrimitiveChimeraActivity.j.g();
                        View inflate3 = contactsConsentPrimitiveChimeraActivity.getLayoutInflater().inflate(com.google.android.gms.R.layout.consent_primitive_learn_more, (ViewGroup) null, false);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.header_1)).setText(com.google.android.gms.R.string.learn_more_which_contacts_header);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.header_2)).setText(com.google.android.gms.R.string.learn_more_happen_header);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.header_3)).setText(com.google.android.gms.R.string.learn_more_manage_data_header);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.body_1)).setText(com.google.android.gms.R.string.sheepdog_learn_more_body_1);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.body_2)).setText(com.google.android.gms.R.string.sheepdog_learn_more_body_2);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.body_3)).setText(com.google.android.gms.R.string.sheepdog_learn_more_body_3);
                        ip ipVar3 = new ip(contactsConsentPrimitiveChimeraActivity);
                        ipVar3.j(com.google.android.gms.R.string.sheepdog_turn_on_header);
                        ipVar3.setPositiveButton(com.google.android.gms.R.string.common_got_it, new DialogInterface.OnClickListener() { // from class: ctpv
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ContactsConsentPrimitiveChimeraActivity.this.j.e();
                            }
                        });
                        ipVar3.setView(inflate3);
                        ipVar3.create().show();
                        break;
                    case 11:
                        contactsConsentPrimitiveChimeraActivity.j.g();
                        View inflate4 = contactsConsentPrimitiveChimeraActivity.getLayoutInflater().inflate(com.google.android.gms.R.layout.consent_primitive_learn_more, (ViewGroup) null, false);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.header_1)).setText(com.google.android.gms.R.string.learn_more_which_contacts_header);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.header_2)).setText(com.google.android.gms.R.string.learn_more_happen_header);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.header_3)).setText(com.google.android.gms.R.string.learn_more_manage_data_header);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.body_1)).setText(com.google.android.gms.R.string.sim_learn_more_body_1);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.body_2)).setText(com.google.android.gms.R.string.sim_learn_more_body_2);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.body_3)).setText(com.google.android.gms.R.string.sim_learn_more_body_3);
                        ip ipVar4 = new ip(contactsConsentPrimitiveChimeraActivity);
                        ipVar4.j(com.google.android.gms.R.string.sim_turn_on_header);
                        ipVar4.setPositiveButton(com.google.android.gms.R.string.common_got_it, new DialogInterface.OnClickListener() { // from class: ctqa
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ContactsConsentPrimitiveChimeraActivity.this.j.e();
                            }
                        });
                        ipVar4.setView(inflate4);
                        ipVar4.create().show();
                        break;
                }
            }
        });
        this.j.f.g(this, new jpd() { // from class: ctpz
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ctsx ctsxVar = (ctsx) obj;
                int i3 = ctsxVar.a;
                ContactsConsentsResults contactsConsentsResults = ctsxVar.b;
                ContactsConsentPrimitiveChimeraActivity contactsConsentPrimitiveChimeraActivity = ContactsConsentPrimitiveChimeraActivity.this;
                if (contactsConsentsResults != null) {
                    Intent intent2 = new Intent();
                    arxd.l(contactsConsentsResults, intent2, "consentsResult");
                    contactsConsentPrimitiveChimeraActivity.setResult(i3, intent2);
                } else {
                    contactsConsentPrimitiveChimeraActivity.setResult(i3);
                }
                contactsConsentPrimitiveChimeraActivity.finish();
            }
        });
    }
}
