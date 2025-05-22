package com.google.android.gms.appinvite.ui.context;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.CustomSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.GridSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.ListSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo;
import defpackage.asxe;
import defpackage.atzs;
import defpackage.aura;
import defpackage.bp;
import defpackage.ew;
import defpackage.fj;
import defpackage.fmrs;
import defpackage.rxx;
import defpackage.us;
import defpackage.vug;
import defpackage.vui;
import defpackage.vuo;
import defpackage.vuq;
import defpackage.vuu;
import defpackage.vux;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public final class ContextualPeopleSelectionChimeraActivity extends rxx implements View.OnClickListener, vuo, vuq, vug {
    private View j;
    private View k;
    private vui l;
    private us m;
    private View n;
    private CharSequence o;
    private CharSequence p;
    private CharSequence q;

    private final void a(boolean z) {
        this.o = null;
        this.p = null;
        this.q = null;
        Intent intent = getIntent();
        if (!z) {
            this.o = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_HINT_TEXT");
            this.p = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_MODE_HINT_TEXT");
            CharSequence charSequenceExtra = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_MODE_WITH_SELECTIONS_HINT_TEXT");
            this.q = charSequenceExtra;
            if (TextUtils.isEmpty(charSequenceExtra)) {
                this.q = this.p;
            }
        }
        if (TextUtils.isEmpty(this.o)) {
            this.o = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_HINT_TEXT");
        }
        if (TextUtils.isEmpty(this.p)) {
            CharSequence charSequenceExtra2 = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_MODE_HINT_TEXT");
            this.p = charSequenceExtra2;
            if (TextUtils.isEmpty(charSequenceExtra2)) {
                this.p = this.o;
            }
        }
        if (TextUtils.isEmpty(this.q)) {
            CharSequence charSequenceExtra3 = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_MODE_WITH_SELECTIONS_HINT_TEXT");
            this.q = charSequenceExtra3;
            if (TextUtils.isEmpty(charSequenceExtra3)) {
                this.q = this.p;
            }
        }
    }

    private final void k() {
        vui vuiVar = this.l;
        CharSequence charSequence = this.o;
        vux vuxVar = vuiVar.av;
        if (vuxVar != null) {
            vuxVar.P(charSequence);
        }
        vuu vuuVar = vuiVar.aw;
        if (vuuVar != null) {
            vuuVar.P(charSequence);
        }
        vui vuiVar2 = this.l;
        CharSequence charSequence2 = vuiVar2.x() > 0 ? this.q : this.p;
        vux vuxVar2 = vuiVar2.av;
        if (vuxVar2 != null) {
            vuxVar2.S(charSequence2);
        }
        vuu vuuVar2 = vuiVar2.aw;
        if (vuuVar2 != null) {
            vuuVar2.S(charSequence2);
        }
    }

    private final void o() {
        this.n.setEnabled(this.l.x() > 0);
    }

    private final void p() {
        vui vuiVar = this.l;
        boolean z = vuiVar != null && vuiVar.L();
        this.j.setVisibility(true != z ? 8 : 0);
        this.k.setVisibility(true == z ? 8 : 0);
    }

    @Override // defpackage.vuo
    public final void l() {
        p();
    }

    @Override // defpackage.vuo
    public final void m(int i, int i2) {
        a(i + i2 > 0);
        k();
        p();
        o();
    }

    @Override // defpackage.vuo
    public final void n(int i, int i2) {
        a(i + i2 > 0);
        k();
        p();
        o();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("com.google.android.gms.appinvite.CONTEXT_RESULT_SELECTED_PEOPLE", new ArrayList<>(this.l.A()));
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Context containerActivity;
        int length;
        int length2;
        ContextualPeopleSelectionChimeraActivity contextualPeopleSelectionChimeraActivity;
        fj fjVar;
        boolean z;
        boolean z2;
        super.onCreate(bundle);
        String q = aura.q(this);
        if (q == null || !asxe.d(this).h(q)) {
            finish();
            return;
        }
        setContentView(R.layout.appinvite_contextual_selection_activity);
        this.j = findViewById(R.id.selection_content);
        this.k = findViewById(R.id.progress_bar);
        try {
            containerActivity = createPackageContext(q, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            containerActivity = getContainerActivity();
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_TITLE");
        if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_COLOR")) {
            int intExtra = intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_COLOR", -16777216);
            SpannableString spannableString = new SpannableString(stringExtra);
            spannableString.setSpan(new ForegroundColorSpan(intExtra), 0, spannableString.length(), 18);
            stringExtra = spannableString;
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.B(stringExtra);
        if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_APPEARANCE")) {
            toolbar.C(containerActivity, intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_APPEARANCE", 0));
        }
        if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_BACKGROUND_COLOR")) {
            toolbar.setBackgroundColor(intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_BACKGROUND_COLOR", 0));
        }
        hJ(toolbar);
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_ACCOUNT_NAME");
        if (TextUtils.isEmpty(stringExtra2)) {
            finish();
            return;
        }
        int intExtra2 = intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON", 0);
        TextView textView = (TextView) findViewById(R.id.select);
        if (intExtra2 != 0) {
            View inflate = LayoutInflater.from(containerActivity).inflate(intExtra2, (ViewGroup) findViewById(R.id.select_frame));
            this.n = inflate;
            inflate.setOnClickListener(this);
            textView.setVisibility(8);
        } else {
            this.n = textView;
            String stringExtra3 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT");
            if (!TextUtils.isEmpty(stringExtra3)) {
                textView.setText(stringExtra3);
            }
            if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR_STATES")) {
                Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR_STATES");
                int size = bundleExtra.size();
                int[][] iArr = new int[size][];
                int[] iArr2 = new int[size];
                for (int i = 0; i < size; i++) {
                    int[] intArray = bundleExtra.getIntArray(Integer.toString(i));
                    if (intArray != null && (length2 = intArray.length) > 0) {
                        iArr2[i] = intArray[0];
                        iArr[i] = Arrays.copyOfRange(intArray, 1, length2);
                    }
                }
                textView.setTextColor(new ColorStateList(iArr, iArr2));
            } else if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR")) {
                textView.setTextColor(containerActivity.getResources().getColorStateList(intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR", 0)));
            }
            if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR_STATES")) {
                Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR_STATES");
                int size2 = bundleExtra2.size();
                StateListDrawable stateListDrawable = new StateListDrawable();
                for (int i2 = 0; i2 < size2; i2++) {
                    int[] intArray2 = bundleExtra2.getIntArray(Integer.toString(i2));
                    if (intArray2 != null && (length = intArray2.length) > 0) {
                        stateListDrawable.addState(Arrays.copyOfRange(intArray2, 1, length), new ColorDrawable(intArray2[0]));
                    }
                }
                textView.setBackgroundDrawable(stateListDrawable);
            } else if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR")) {
                textView.setBackgroundDrawable(containerActivity.getResources().getDrawable(intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR", 0)));
            }
        }
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_MESSAGE");
        if (!TextUtils.isEmpty(charSequenceExtra)) {
            View inflate2 = getLayoutInflater().inflate(R.layout.appinvite_contextual_selection_message, (ViewGroup) this.j, false);
            this.m = new us(inflate2);
            ((TextView) inflate2.findViewById(R.id.message)).setText(charSequenceExtra);
        }
        ew supportFragmentManager = getSupportFragmentManager();
        bp bpVar = new bp(supportFragmentManager);
        vui vuiVar = (vui) supportFragmentManager.h("selectionFragment");
        this.l = vuiVar;
        if (vuiVar == null) {
            ArrayList g = atzs.g(intent, "com.google.android.gms.appinvite.CONTEXT_INITIAL_SELECTION", ContactPerson.CREATOR);
            int intExtra3 = intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_MAX_SELECTED", Integer.MAX_VALUE);
            boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_ICON", false);
            boolean booleanExtra2 = intent.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_SELECTION", false);
            boolean booleanExtra3 = intent.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_OVERRIDE_CONTACT_METHOD_ORDER", false);
            String[] stringArrayExtra = intent.getStringArrayExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_TYPES");
            boolean booleanExtra4 = intent.getBooleanExtra("com.google.android.gms.appinvite.EXTRA_EXCLUDE_NON_GAIA_CONTACTS", false);
            boolean booleanExtra5 = intent.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_DOCK_RECIPIENTS", false);
            ArrayList g2 = atzs.g(intent, "com.google.android.gms.appinvite.CONTEXT_ADDITIONAL_GRID_PEOPLE", ContactPerson.CREATOR);
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_GAIA_IDS");
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_EMAIL_ADDRESSES");
            ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_PHONE_NUMBERS");
            ArrayList g3 = atzs.g(intent, "com.google.android.gms.appinvite.CONTEXT_ADDITIONAL_LIST_PEOPLE", ContactPerson.CREATOR);
            String stringExtra4 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_SOURCE");
            String stringExtra5 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_SOURCE_OPTIONS");
            int intExtra4 = intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_MAX_PORTRAIT_GRID_ITEMS", Integer.MAX_VALUE);
            int intExtra5 = intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_MAX_LANDSCAPE_GRID_ITEMS", Integer.MAX_VALUE);
            String stringExtra6 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_SOURCE");
            String stringExtra7 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_SOURCE_OPTIONS");
            String stringExtra8 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_HEADER_TEXT");
            String stringExtra9 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_SUB_HEADER_TEXT");
            String stringExtra10 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_HEADER_TEXT");
            String stringExtra11 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_SUB_HEADER_TEXT");
            boolean booleanExtra6 = intent.getBooleanExtra("com.google.android.gms.appinvite.INCLUDE_PUBLIC_PROFILE_SEARCH", false);
            ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_GAIA_IDS");
            ArrayList<String> stringArrayListExtra5 = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_EMAIL_ADDRESSES");
            ArrayList<String> stringArrayListExtra6 = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_PHONE_NUMBERS");
            String stringExtra12 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_MESSAGE");
            ArrayList arrayList = new ArrayList();
            if (this.m != null) {
                arrayList.add(new CustomSectionInfo(new int[]{R.layout.appinvite_contextual_selection_message}));
            }
            SelectionSectionInfo selectionSectionInfo = new SelectionSectionInfo();
            selectionSectionInfo.p = booleanExtra5;
            selectionSectionInfo.b = true;
            arrayList.add(selectionSectionInfo);
            if (TextUtils.isEmpty(stringExtra4)) {
                z = false;
            } else {
                z = false;
                LoaderSectionInfo listSectionInfo = intent.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_DISPLAY_GRID_AS_A_LIST", false) ? new ListSectionInfo(stringExtra4) : new GridSectionInfo(stringExtra4);
                listSectionInfo.d = stringExtra5;
                listSectionInfo.b = stringArrayExtra;
                listSectionInfo.c = booleanExtra3;
                listSectionInfo.j = intExtra4;
                listSectionInfo.k = intExtra5;
                listSectionInfo.l = g2;
                listSectionInfo.m = stringArrayListExtra;
                listSectionInfo.b(stringArrayListExtra2);
                listSectionInfo.c(stringArrayListExtra3);
                listSectionInfo.g = stringExtra8;
                listSectionInfo.h = stringExtra9;
                arrayList.add(listSectionInfo);
            }
            if (TextUtils.isEmpty(stringExtra6)) {
                z2 = true;
            } else {
                ListSectionInfo listSectionInfo2 = new ListSectionInfo(stringExtra6);
                listSectionInfo2.d = stringExtra7;
                listSectionInfo2.b = stringArrayExtra;
                listSectionInfo2.c = booleanExtra3;
                z2 = true;
                listSectionInfo2.e = true;
                listSectionInfo2.l = g3;
                listSectionInfo2.g = stringExtra10;
                listSectionInfo2.h = stringExtra11;
                arrayList.add(listSectionInfo2);
            }
            Resources resources = getResources();
            boolean z3 = (fmrs.a.lK().i() && booleanExtra) ? z2 : z;
            int integer = resources.getInteger(R.integer.appinivte_num_portrait_grid_columns);
            int integer2 = resources.getInteger(R.integer.appinivte_num_landscape_grid_columns);
            fjVar = bpVar;
            vui z4 = vui.z(stringExtra2, intExtra3, g, booleanExtra2, null, z3, stringArrayExtra, booleanExtra4, integer, integer2, arrayList, q, booleanExtra6, stringArrayListExtra4, stringArrayListExtra5, stringArrayListExtra6, stringExtra12, true);
            contextualPeopleSelectionChimeraActivity = this;
            contextualPeopleSelectionChimeraActivity.l = z4;
            fjVar.u(R.id.fragment_container, z4, "selectionFragment");
        } else {
            contextualPeopleSelectionChimeraActivity = this;
            fjVar = bpVar;
        }
        vui vuiVar2 = contextualPeopleSelectionChimeraActivity.l;
        vuiVar2.ag = contextualPeopleSelectionChimeraActivity;
        vuiVar2.ah = contextualPeopleSelectionChimeraActivity;
        vuiVar2.az = contextualPeopleSelectionChimeraActivity;
        contextualPeopleSelectionChimeraActivity.a(false);
        contextualPeopleSelectionChimeraActivity.k();
        if (fjVar.j()) {
            return;
        }
        fjVar.a();
    }

    @Override // defpackage.rza
    protected final void onResumeFragments() {
        super.onResumeFragments();
        p();
    }

    @Override // defpackage.vuq
    public final void r(ContactPerson contactPerson, boolean z) {
        if (!z ? this.l.x() == 0 : this.l.x() == 1) {
            k();
        }
        o();
    }

    @Override // defpackage.vug
    public final us v() {
        return this.m;
    }
}
